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

package com.liferay.asset.kernel.service;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;

/**
 * Provides the local service utility for AssetEntry. This utility wraps
 * <code>com.liferay.portlet.asset.service.impl.AssetEntryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetEntryLocalService
 * @generated
 */
public class AssetEntryLocalServiceUtil {

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.portlet.asset.service.impl.AssetEntryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AssetEntryLocalServiceUtil} to access the asset entry local service. Add custom service methods to <code>com.liferay.portlet.asset.service.impl.AssetEntryLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static void addAssetCategoryAssetEntries(
		long categoryId,
		java.util.List<com.liferay.asset.kernel.model.AssetEntry>
			assetEntries) {

		getService().addAssetCategoryAssetEntries(categoryId, assetEntries);
	}

	public static void addAssetCategoryAssetEntries(
		long categoryId, long[] entryIds) {

		getService().addAssetCategoryAssetEntries(categoryId, entryIds);
	}

	public static void addAssetCategoryAssetEntry(
		long categoryId, com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		getService().addAssetCategoryAssetEntry(categoryId, assetEntry);
	}

	public static void addAssetCategoryAssetEntry(
		long categoryId, long entryId) {

		getService().addAssetCategoryAssetEntry(categoryId, entryId);
	}

	/**
	 * Adds the asset entry to the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetEntry the asset entry
	 * @return the asset entry that was added
	 */
	public static com.liferay.asset.kernel.model.AssetEntry addAssetEntry(
		com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		return getService().addAssetEntry(assetEntry);
	}

	public static void addAssetTagAssetEntries(
		long tagId,
		java.util.List<com.liferay.asset.kernel.model.AssetEntry>
			assetEntries) {

		getService().addAssetTagAssetEntries(tagId, assetEntries);
	}

	public static void addAssetTagAssetEntries(long tagId, long[] entryIds) {
		getService().addAssetTagAssetEntries(tagId, entryIds);
	}

	public static void addAssetTagAssetEntry(
		long tagId, com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		getService().addAssetTagAssetEntry(tagId, assetEntry);
	}

	public static void addAssetTagAssetEntry(long tagId, long entryId) {
		getService().addAssetTagAssetEntry(tagId, entryId);
	}

	public static void clearAssetCategoryAssetEntries(long categoryId) {
		getService().clearAssetCategoryAssetEntries(categoryId);
	}

	public static void clearAssetTagAssetEntries(long tagId) {
		getService().clearAssetTagAssetEntries(tagId);
	}

	/**
	 * Creates a new asset entry with the primary key. Does not add the asset entry to the database.
	 *
	 * @param entryId the primary key for the new asset entry
	 * @return the new asset entry
	 */
	public static com.liferay.asset.kernel.model.AssetEntry createAssetEntry(
		long entryId) {

		return getService().createAssetEntry(entryId);
	}

	public static void deleteAssetCategoryAssetEntries(
		long categoryId,
		java.util.List<com.liferay.asset.kernel.model.AssetEntry>
			assetEntries) {

		getService().deleteAssetCategoryAssetEntries(categoryId, assetEntries);
	}

	public static void deleteAssetCategoryAssetEntries(
		long categoryId, long[] entryIds) {

		getService().deleteAssetCategoryAssetEntries(categoryId, entryIds);
	}

	public static void deleteAssetCategoryAssetEntry(
		long categoryId, com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		getService().deleteAssetCategoryAssetEntry(categoryId, assetEntry);
	}

	public static void deleteAssetCategoryAssetEntry(
		long categoryId, long entryId) {

		getService().deleteAssetCategoryAssetEntry(categoryId, entryId);
	}

	/**
	 * Deletes the asset entry from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assetEntry the asset entry
	 * @return the asset entry that was removed
	 */
	public static com.liferay.asset.kernel.model.AssetEntry deleteAssetEntry(
		com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		return getService().deleteAssetEntry(assetEntry);
	}

	/**
	 * Deletes the asset entry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param entryId the primary key of the asset entry
	 * @return the asset entry that was removed
	 * @throws PortalException if a asset entry with the primary key could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetEntry deleteAssetEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteAssetEntry(entryId);
	}

	public static void deleteAssetTagAssetEntries(
		long tagId,
		java.util.List<com.liferay.asset.kernel.model.AssetEntry>
			assetEntries) {

		getService().deleteAssetTagAssetEntries(tagId, assetEntries);
	}

	public static void deleteAssetTagAssetEntries(long tagId, long[] entryIds) {
		getService().deleteAssetTagAssetEntries(tagId, entryIds);
	}

	public static void deleteAssetTagAssetEntry(
		long tagId, com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		getService().deleteAssetTagAssetEntry(tagId, assetEntry);
	}

	public static void deleteAssetTagAssetEntry(long tagId, long entryId) {
		getService().deleteAssetTagAssetEntry(tagId, entryId);
	}

	public static void deleteEntry(
			com.liferay.asset.kernel.model.AssetEntry entry)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteEntry(entry);
	}

	public static void deleteEntry(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteEntry(entryId);
	}

	public static void deleteEntry(String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteEntry(className, classPK);
	}

	public static void deleteGroupEntries(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteGroupEntries(groupId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portlet.asset.model.impl.AssetEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portlet.asset.model.impl.AssetEntryModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.liferay.asset.kernel.model.AssetEntry fetchAssetEntry(
		long entryId) {

		return getService().fetchAssetEntry(entryId);
	}

	public static com.liferay.asset.kernel.model.AssetEntry fetchEntry(
		long entryId) {

		return getService().fetchEntry(entryId);
	}

	public static com.liferay.asset.kernel.model.AssetEntry fetchEntry(
		long classNameId, long classPK) {

		return getService().fetchEntry(classNameId, classPK);
	}

	public static com.liferay.asset.kernel.model.AssetEntry fetchEntry(
		long groupId, String classUuid) {

		return getService().fetchEntry(groupId, classUuid);
	}

	public static com.liferay.asset.kernel.model.AssetEntry fetchEntry(
		String className, long classPK) {

		return getService().fetchEntry(className, classPK);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
			getAncestorEntries(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAncestorEntries(entryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetCategoryAssetEntries(long categoryId) {

		return getService().getAssetCategoryAssetEntries(categoryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetCategoryAssetEntries(long categoryId, int start, int end) {

		return getService().getAssetCategoryAssetEntries(
			categoryId, start, end);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetCategoryAssetEntries(
			long categoryId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetEntry> orderByComparator) {

		return getService().getAssetCategoryAssetEntries(
			categoryId, start, end, orderByComparator);
	}

	public static int getAssetCategoryAssetEntriesCount(long categoryId) {
		return getService().getAssetCategoryAssetEntriesCount(categoryId);
	}

	/**
	 * Returns the categoryIds of the asset categories associated with the asset entry.
	 *
	 * @param entryId the entryId of the asset entry
	 * @return long[] the categoryIds of asset categories associated with the asset entry
	 */
	public static long[] getAssetCategoryPrimaryKeys(long entryId) {
		return getService().getAssetCategoryPrimaryKeys(entryId);
	}

	/**
	 * Returns a range of all the asset entries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.liferay.portlet.asset.model.impl.AssetEntryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of asset entries
	 * @param end the upper bound of the range of asset entries (not inclusive)
	 * @return the range of asset entries
	 */
	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetEntries(int start, int end) {

		return getService().getAssetEntries(start, end);
	}

	/**
	 * Returns the number of asset entries.
	 *
	 * @return the number of asset entries
	 */
	public static int getAssetEntriesCount() {
		return getService().getAssetEntriesCount();
	}

	/**
	 * Returns the asset entry with the primary key.
	 *
	 * @param entryId the primary key of the asset entry
	 * @return the asset entry
	 * @throws PortalException if a asset entry with the primary key could not be found
	 */
	public static com.liferay.asset.kernel.model.AssetEntry getAssetEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getAssetEntry(entryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetTagAssetEntries(long tagId) {

		return getService().getAssetTagAssetEntries(tagId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetTagAssetEntries(long tagId, int start, int end) {

		return getService().getAssetTagAssetEntries(tagId, start, end);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getAssetTagAssetEntries(
			long tagId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<com.liferay.asset.kernel.model.AssetEntry> orderByComparator) {

		return getService().getAssetTagAssetEntries(
			tagId, start, end, orderByComparator);
	}

	public static int getAssetTagAssetEntriesCount(long tagId) {
		return getService().getAssetTagAssetEntriesCount(tagId);
	}

	/**
	 * Returns the tagIds of the asset tags associated with the asset entry.
	 *
	 * @param entryId the entryId of the asset entry
	 * @return long[] the tagIds of asset tags associated with the asset entry
	 */
	public static long[] getAssetTagPrimaryKeys(long entryId) {
		return getService().getAssetTagPrimaryKeys(entryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
			getChildEntries(long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getChildEntries(entryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getCompanyEntries(long companyId, int start, int end) {

		return getService().getCompanyEntries(companyId, start, end);
	}

	public static int getCompanyEntriesCount(long companyId) {
		return getService().getCompanyEntriesCount(companyId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getEntries(
			com.liferay.asset.kernel.service.persistence.AssetEntryQuery
				entryQuery) {

		return getService().getEntries(entryQuery);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getEntries(
			long[] groupIds, long[] classNameIds, long[] classTypeIds,
			String keywords, String userName, String title, String description,
			Boolean listable, boolean advancedSearch, boolean andOperator,
			int start, int end, String orderByCol1, String orderByCol2,
			String orderByType1, String orderByType2) {

		return getService().getEntries(
			groupIds, classNameIds, classTypeIds, keywords, userName, title,
			description, listable, advancedSearch, andOperator, start, end,
			orderByCol1, orderByCol2, orderByType1, orderByType2);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getEntries(
			long[] groupIds, long[] classNameIds, String keywords,
			String userName, String title, String description, Boolean listable,
			boolean advancedSearch, boolean andOperator, int start, int end,
			String orderByCol1, String orderByCol2, String orderByType1,
			String orderByType2) {

		return getService().getEntries(
			groupIds, classNameIds, keywords, userName, title, description,
			listable, advancedSearch, andOperator, start, end, orderByCol1,
			orderByCol2, orderByType1, orderByType2);
	}

	public static int getEntriesCount(
		com.liferay.asset.kernel.service.persistence.AssetEntryQuery
			entryQuery) {

		return getService().getEntriesCount(entryQuery);
	}

	public static int getEntriesCount(
		long[] groupIds, long[] classNameIds, long[] classTypeIds,
		String keywords, String userName, String title, String description,
		Boolean listable, boolean advancedSearch, boolean andOperator) {

		return getService().getEntriesCount(
			groupIds, classNameIds, classTypeIds, keywords, userName, title,
			description, listable, advancedSearch, andOperator);
	}

	public static int getEntriesCount(
		long[] groupIds, long[] classNameIds, String keywords, String userName,
		String title, String description, Boolean listable,
		boolean advancedSearch, boolean andOperator) {

		return getService().getEntriesCount(
			groupIds, classNameIds, keywords, userName, title, description,
			listable, advancedSearch, andOperator);
	}

	public static com.liferay.asset.kernel.model.AssetEntry getEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEntry(entryId);
	}

	public static com.liferay.asset.kernel.model.AssetEntry getEntry(
			long groupId, String classUuid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEntry(groupId, classUuid);
	}

	public static com.liferay.asset.kernel.model.AssetEntry getEntry(
			String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getEntry(className, classPK);
	}

	public static double getEntryPriority(long classNameId, long classPK) {
		return getService().getEntryPriority(classNameId, classPK);
	}

	public static double getEntryPriority(String className, long classPK) {
		return getService().getEntryPriority(className, classPK);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getGroupEntries(long groupId) {

		return getService().getGroupEntries(groupId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static com.liferay.asset.kernel.model.AssetEntry getNextEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getNextEntry(entryId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.asset.kernel.model.AssetEntry getParentEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getParentEntry(entryId);
	}

	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.liferay.asset.kernel.model.AssetEntry getPreviousEntry(
			long entryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPreviousEntry(entryId);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getTopViewedEntries(String className, boolean asc, int start, int end) {

		return getService().getTopViewedEntries(className, asc, start, end);
	}

	public static java.util.List<com.liferay.asset.kernel.model.AssetEntry>
		getTopViewedEntries(
			String[] className, boolean asc, int start, int end) {

		return getService().getTopViewedEntries(className, asc, start, end);
	}

	public static boolean hasAssetCategoryAssetEntries(long categoryId) {
		return getService().hasAssetCategoryAssetEntries(categoryId);
	}

	public static boolean hasAssetCategoryAssetEntry(
		long categoryId, long entryId) {

		return getService().hasAssetCategoryAssetEntry(categoryId, entryId);
	}

	public static boolean hasAssetTagAssetEntries(long tagId) {
		return getService().hasAssetTagAssetEntries(tagId);
	}

	public static boolean hasAssetTagAssetEntry(long tagId, long entryId) {
		return getService().hasAssetTagAssetEntry(tagId, entryId);
	}

	public static void incrementViewCounter(
			long userId, com.liferay.asset.kernel.model.AssetEntry assetEntry)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().incrementViewCounter(userId, assetEntry);
	}

	public static com.liferay.asset.kernel.model.AssetEntry
			incrementViewCounter(
				long companyId, long userId, String className, long classPK)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().incrementViewCounter(
			companyId, userId, className, classPK);
	}

	public static void incrementViewCounter(
		long companyId, long userId, String className, long classPK,
		int increment) {

		getService().incrementViewCounter(
			companyId, userId, className, classPK, increment);
	}

	public static void reindex(
			java.util.List<com.liferay.asset.kernel.model.AssetEntry> entries)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().reindex(entries);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, long[] classNameIds,
		long classTypeId, String keywords, boolean showNonindexable,
		int[] statuses, int start, int end,
		com.liferay.portal.kernel.search.Sort sort) {

		return getService().search(
			companyId, groupIds, userId, classNameIds, classTypeId, keywords,
			showNonindexable, statuses, start, end, sort);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String keywords, boolean showNonindexable, int status,
		int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, keywords,
			showNonindexable, status, start, end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String keywords, boolean showNonindexable,
		int[] statuses, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, keywords,
			showNonindexable, statuses, start, end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String keywords, boolean showNonindexable,
		int[] statuses, int start, int end,
		com.liferay.portal.kernel.search.Sort sort) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, keywords,
			showNonindexable, statuses, start, end, sort);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String keywords, int status, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, keywords,
			status, start, end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String userName, String title, String description,
		String assetCategoryIds, String assetTagNames, boolean showNonindexable,
		int status, boolean andSearch, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, userName,
			title, description, assetCategoryIds, assetTagNames,
			showNonindexable, status, andSearch, start, end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String userName, String title, String description,
		String assetCategoryIds, String assetTagNames, boolean showNonindexable,
		int[] statuses, boolean andSearch, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, userName,
			title, description, assetCategoryIds, assetTagNames,
			showNonindexable, statuses, andSearch, start, end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String userName, String title, String description,
		String assetCategoryIds, String assetTagNames, int status,
		boolean andSearch, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, classTypeId, userName,
			title, description, assetCategoryIds, assetTagNames, status,
			andSearch, start, end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		String keywords, int status, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, keywords, status, start,
			end);
	}

	public static com.liferay.portal.kernel.search.Hits search(
		long companyId, long[] groupIds, long userId, String className,
		String userName, String title, String description,
		String assetCategoryIds, String assetTagNames, int status,
		boolean andSearch, int start, int end) {

		return getService().search(
			companyId, groupIds, userId, className, userName, title,
			description, assetCategoryIds, assetTagNames, status, andSearch,
			start, end);
	}

	public static long searchCount(
		long companyId, long[] groupIds, long userId, long[] classNameIds,
		long classTypeId, String keywords, boolean showNonindexable,
		int[] statuses) {

		return getService().searchCount(
			companyId, groupIds, userId, classNameIds, classTypeId, keywords,
			showNonindexable, statuses);
	}

	public static long searchCount(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String keywords, boolean showNonindexable,
		int[] statuses) {

		return getService().searchCount(
			companyId, groupIds, userId, className, classTypeId, keywords,
			showNonindexable, statuses);
	}

	public static long searchCount(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String keywords, String assetCategoryIds,
		String assetTagNames, boolean showInvisible, boolean showNonindexable,
		int[] statuses, boolean andSearch) {

		return getService().searchCount(
			companyId, groupIds, userId, className, classTypeId, keywords,
			assetCategoryIds, assetTagNames, showInvisible, showNonindexable,
			statuses, andSearch);
	}

	public static long searchCount(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String userName, String title, String description,
		String assetCategoryIds, String assetTagNames, boolean showInvisible,
		boolean showNonindexable, int[] statuses, boolean andSearch) {

		return getService().searchCount(
			companyId, groupIds, userId, className, classTypeId, userName,
			title, description, assetCategoryIds, assetTagNames, showInvisible,
			showNonindexable, statuses, andSearch);
	}

	public static long searchCount(
		long companyId, long[] groupIds, long userId, String className,
		long classTypeId, String userName, String title, String description,
		String assetCategoryIds, String assetTagNames, boolean showNonindexable,
		int[] statuses, boolean andSearch) {

		return getService().searchCount(
			companyId, groupIds, userId, className, classTypeId, userName,
			title, description, assetCategoryIds, assetTagNames,
			showNonindexable, statuses, andSearch);
	}

	public static void setAssetCategoryAssetEntries(
		long categoryId, long[] entryIds) {

		getService().setAssetCategoryAssetEntries(categoryId, entryIds);
	}

	public static void setAssetTagAssetEntries(long tagId, long[] entryIds) {
		getService().setAssetTagAssetEntries(tagId, entryIds);
	}

	/**
	 * Updates the asset entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param assetEntry the asset entry
	 * @return the asset entry that was updated
	 */
	public static com.liferay.asset.kernel.model.AssetEntry updateAssetEntry(
		com.liferay.asset.kernel.model.AssetEntry assetEntry) {

		return getService().updateAssetEntry(assetEntry);
	}

	public static com.liferay.asset.kernel.model.AssetEntry updateEntry(
			long userId, long groupId, java.util.Date createDate,
			java.util.Date modifiedDate, String className, long classPK,
			String classUuid, long classTypeId, long[] categoryIds,
			String[] tagNames, boolean listable, boolean visible,
			java.util.Date startDate, java.util.Date endDate,
			java.util.Date publishDate, java.util.Date expirationDate,
			String mimeType, String title, String description, String summary,
			String url, String layoutUuid, int height, int width,
			Double priority)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEntry(
			userId, groupId, createDate, modifiedDate, className, classPK,
			classUuid, classTypeId, categoryIds, tagNames, listable, visible,
			startDate, endDate, publishDate, expirationDate, mimeType, title,
			description, summary, url, layoutUuid, height, width, priority);
	}

	/**
	 * @deprecated As of Judson (7.1.x), replaced by {@link #updateEntry(long,
	 long, Date, Date, String, long, String, long, long[],
	 String[], boolean, boolean, Date, Date, Date, Date, String,
	 String, String, String, String, String, int, int, Double)}
	 */
	@Deprecated
	public static com.liferay.asset.kernel.model.AssetEntry updateEntry(
			long userId, long groupId, java.util.Date createDate,
			java.util.Date modifiedDate, String className, long classPK,
			String classUuid, long classTypeId, long[] categoryIds,
			String[] tagNames, boolean listable, boolean visible,
			java.util.Date startDate, java.util.Date endDate,
			java.util.Date expirationDate, String mimeType, String title,
			String description, String summary, String url, String layoutUuid,
			int height, int width, Double priority)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEntry(
			userId, groupId, createDate, modifiedDate, className, classPK,
			classUuid, classTypeId, categoryIds, tagNames, listable, visible,
			startDate, endDate, expirationDate, mimeType, title, description,
			summary, url, layoutUuid, height, width, priority);
	}

	public static com.liferay.asset.kernel.model.AssetEntry updateEntry(
			long userId, long groupId, String className, long classPK,
			long[] categoryIds, String[] tagNames)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEntry(
			userId, groupId, className, classPK, categoryIds, tagNames);
	}

	public static com.liferay.asset.kernel.model.AssetEntry updateEntry(
			String className, long classPK, java.util.Date publishDate,
			java.util.Date expirationDate, boolean listable, boolean visible)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateEntry(
			className, classPK, publishDate, expirationDate, listable, visible);
	}

	public static com.liferay.asset.kernel.model.AssetEntry updateVisible(
			com.liferay.asset.kernel.model.AssetEntry entry, boolean visible)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateVisible(entry, visible);
	}

	public static com.liferay.asset.kernel.model.AssetEntry updateVisible(
			String className, long classPK, boolean visible)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateVisible(className, classPK, visible);
	}

	public static void validate(
			long groupId, String className, long classPK, long classTypePK,
			long[] categoryIds, String[] tagNames)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().validate(
			groupId, className, classPK, classTypePK, categoryIds, tagNames);
	}

	public static void validate(
			long groupId, String className, long classTypePK,
			long[] categoryIds, String[] tagNames)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().validate(
			groupId, className, classTypePK, categoryIds, tagNames);
	}

	public static AssetEntryLocalService getService() {
		if (_service == null) {
			_service = (AssetEntryLocalService)PortalBeanLocatorUtil.locate(
				AssetEntryLocalService.class.getName());
		}

		return _service;
	}

	private static AssetEntryLocalService _service;

}