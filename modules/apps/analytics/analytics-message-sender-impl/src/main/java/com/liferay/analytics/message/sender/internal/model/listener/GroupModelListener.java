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

package com.liferay.analytics.message.sender.internal.model.listener;

import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.ModelListener;
import com.liferay.portal.kernel.service.GroupLocalService;

import java.util.Arrays;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Rachael Koestartyo
 */
@Component(immediate = true, service = ModelListener.class)
public class GroupModelListener extends BaseEntityModelListener<Group> {

	@Override
	protected List<String> getAttributeNames() {
		return _attributeNames;
	}

	@Override
	protected Group getOriginalModel(Group group) throws Exception {
		return _groupLocalService.getGroup(group.getGroupId());
	}

	@Override
	protected String getPrimaryKeyName() {
		return "groupId";
	}

	@Override
	protected boolean isExcluded(Group group) {
		if (!group.isSite()) {
			return true;
		}

		return false;
	}

	private static final List<String> _attributeNames = Arrays.asList(
		"active", "classNameId", "classPK", "companyId", "creatorUserId",
		"description", "descriptionCurrentValue", "descriptiveName",
		"friendlyURL", "groupKey", "inheritContent", "liveGroupId",
		"manualMembership", "membershipRestriction", "name", "nameCurrentValue",
		"parentGroupId", "remoteStagingGroupCount", "site", "treePath", "type",
		"uuid");

	@Reference
	private GroupLocalService _groupLocalService;

}