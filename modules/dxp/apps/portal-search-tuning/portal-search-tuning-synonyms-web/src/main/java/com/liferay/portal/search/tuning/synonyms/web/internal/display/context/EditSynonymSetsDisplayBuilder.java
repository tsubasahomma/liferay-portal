/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.portal.search.tuning.synonyms.web.internal.display.context;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.search.tuning.synonyms.web.internal.index.SynonymSet;
import com.liferay.portal.search.tuning.synonyms.web.internal.index.SynonymSetIndexReader;

import java.util.Map;
import java.util.Optional;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Kevin Tan
 */
public class EditSynonymSetsDisplayBuilder {

	public EditSynonymSetsDisplayBuilder(
		HttpServletRequest httpServletRequest, RenderRequest renderRequest,
		RenderResponse renderResponse,
		SynonymSetIndexReader synonymSetIndexReader) {

		_httpServletRequest = httpServletRequest;
		_renderRequest = renderRequest;
		_renderResponse = renderResponse;
		_synonymSetIndexReader = synonymSetIndexReader;
	}

	public EditSynonymSetsDisplayContext build() {
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext =
			new EditSynonymSetsDisplayContext();

		_synonymSetOptional = _getSynonymSetOptional();

		_setBackURL(editSynonymSetsDisplayContext);
		_setData(editSynonymSetsDisplayContext);
		_setFormName(editSynonymSetsDisplayContext);
		_setInputName(editSynonymSetsDisplayContext);
		_setRedirect(editSynonymSetsDisplayContext);
		_setSynonymSetId(editSynonymSetsDisplayContext);

		return editSynonymSetsDisplayContext;
	}

	private String _getBackURL() {
		return ParamUtil.getString(
			_httpServletRequest, "backURL", _getRedirect());
	}

	private String _getFormName() {
		return "synonymSetsForm";
	}

	private String _getInputName() {
		return "synonymSet";
	}

	private String _getRedirect() {
		return ParamUtil.getString(_httpServletRequest, "redirect");
	}

	private Optional<SynonymSet> _getSynonymSetOptional() {
		return Optional.ofNullable(
			ParamUtil.getString(_renderRequest, "synonymSetId", null)
		).flatMap(
			_synonymSetIndexReader::fetchOptional
		);
	}

	private String _getSynonymSets() {
		return _synonymSetOptional.map(
			SynonymSet::getSynonyms
		).orElse(
			StringPool.BLANK
		);
	}

	private void _setBackURL(
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext) {

		editSynonymSetsDisplayContext.setBackURL(_getBackURL());
	}

	private void _setData(
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext) {

		Map<String, Object> data = HashMapBuilder.<String, Object>put(
			"formName", _renderResponse.getNamespace() + _getFormName()
		).put(
			"inputName", _renderResponse.getNamespace() + _getInputName()
		).put(
			"synonymSets", _getSynonymSets()
		).build();

		editSynonymSetsDisplayContext.setData(data);
	}

	private void _setFormName(
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext) {

		editSynonymSetsDisplayContext.setFormName(_getFormName());
	}

	private void _setInputName(
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext) {

		editSynonymSetsDisplayContext.setInputName(_getInputName());
	}

	private void _setRedirect(
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext) {

		editSynonymSetsDisplayContext.setRedirect(_getRedirect());
	}

	private void _setSynonymSetId(
		EditSynonymSetsDisplayContext editSynonymSetsDisplayContext) {

		_synonymSetOptional.ifPresent(
			synonymSet -> editSynonymSetsDisplayContext.setSynonymSetId(
				synonymSet.getId()));
	}

	private final HttpServletRequest _httpServletRequest;
	private final RenderRequest _renderRequest;
	private final RenderResponse _renderResponse;
	private final SynonymSetIndexReader _synonymSetIndexReader;
	private Optional<SynonymSet> _synonymSetOptional;

}