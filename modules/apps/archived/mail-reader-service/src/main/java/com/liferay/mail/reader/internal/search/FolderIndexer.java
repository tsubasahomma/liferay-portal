/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.mail.reader.internal.search;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeIndexerUtil;
import com.liferay.mail.reader.model.Folder;
import com.liferay.mail.reader.service.FolderLocalService;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.Hits;
import com.liferay.portal.kernel.search.IndexSearcherHelper;
import com.liferay.portal.kernel.search.IndexWriterHelper;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SortFactoryUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.search.generic.BooleanQueryImpl;
import com.liferay.portal.kernel.util.GetterUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

/**
 * @author     Michael C. Han
 * @author     Peter Fellwock
 * @deprecated As of Judson (7.1.x)
 */
@Deprecated
public class FolderIndexer extends BaseIndexer<Folder> {

	public static final String CLASS_NAME = Folder.class.getName();

	@Override
	public String getClassName() {
		return CLASS_NAME;
	}

	@Override
	protected void doDelete(Folder folder) throws Exception {
		SearchContext searchContext = new SearchContext();

		searchContext.setCompanyId(folder.getCompanyId());
		searchContext.setEnd(QueryUtil.ALL_POS);
		searchContext.setSearchEngineId(getSearchEngineId());
		searchContext.setSorts(SortFactoryUtil.getDefaultSorts());
		searchContext.setStart(QueryUtil.ALL_POS);

		BooleanQuery booleanQuery = new BooleanQueryImpl();

		booleanQuery.addRequiredTerm(Field.ENTRY_CLASS_NAME, CLASS_NAME);

		booleanQuery.addRequiredTerm("folderId", folder.getFolderId());

		Hits hits = indexSearcherHelper.search(searchContext, booleanQuery);

		List<String> uids = new ArrayList<>(hits.getLength());

		for (int i = 0; i < hits.getLength(); i++) {
			Document document = hits.doc(i);

			uids.add(document.get(Field.UID));
		}

		indexWriterHelper.deleteDocuments(
			getSearchEngineId(), folder.getCompanyId(), uids,
			isCommitImmediately());
	}

	@Override
	protected Document doGetDocument(Folder folder) throws Exception {
		Document document = getBaseModelDocument(CLASS_NAME, folder);

		ExpandoBridge expandoBridge = folder.getExpandoBridge();

		document.addKeyword(Field.FOLDER_ID, folder.getFolderId());
		document.addText(Field.NAME, folder.getDisplayName());

		document.addKeyword("accountId", folder.getAccountId());

		ExpandoBridgeIndexerUtil.addAttributes(document, expandoBridge);

		return document;
	}

	@Override
	protected Summary doGetSummary(
		Document doc, Locale locale, String snippet,
		PortletRequest portletRequest, PortletResponse portletResponse) {

		return null;
	}

	@Override
	protected void doReindex(Folder folder) throws Exception {
		indexWriterHelper.updateDocument(
			getSearchEngineId(), folder.getCompanyId(), getDocument(folder),
			isCommitImmediately());
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		doReindex(folderLocalService.getFolder(classPK));
	}

	@Override
	protected void doReindex(String[] ids) throws Exception {
		long companyId = GetterUtil.getLong(ids[0]);

		reindexMessages(companyId);
	}

	protected void reindexMessages(long companyId) throws PortalException {
		final IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			folderLocalService.getIndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setCompanyId(companyId);
		indexableActionableDynamicQuery.setPerformActionMethod(
			(Folder folder) -> {
				try {
					indexableActionableDynamicQuery.addDocuments(
						getDocument(folder));
				}
				catch (PortalException pe) {
					if (_log.isWarnEnabled()) {
						_log.warn(
							"Unable to index folder " + folder.getFolderId(),
							pe);
					}
				}
			});
		indexableActionableDynamicQuery.setSearchEngineId(getSearchEngineId());

		indexableActionableDynamicQuery.performActions();
	}

	protected FolderLocalService folderLocalService;
	protected IndexSearcherHelper indexSearcherHelper;
	protected IndexWriterHelper indexWriterHelper;

	private static final Log _log = LogFactoryUtil.getLog(FolderIndexer.class);

}