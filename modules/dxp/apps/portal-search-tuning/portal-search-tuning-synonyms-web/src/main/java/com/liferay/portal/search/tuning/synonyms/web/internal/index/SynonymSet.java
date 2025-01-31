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

package com.liferay.portal.search.tuning.synonyms.web.internal.index;

/**
 * @author Adam Brandizzi
 */
public class SynonymSet {

	public SynonymSet(SynonymSet synonymSet) {
		_id = synonymSet._id;
		_index = synonymSet._index;
		_synonyms = synonymSet._synonyms;
	}

	public String getId() {
		return _id;
	}

	public String getIndex() {
		return _index;
	}

	public String getSynonyms() {
		return _synonyms;
	}

	public static class SynonymSetBuilder {

		public SynonymSetBuilder() {
			_synonymSet = new SynonymSet();
		}

		public SynonymSetBuilder(SynonymSet synonymSet) {
			_synonymSet = synonymSet;
		}

		public SynonymSet build() {
			return new SynonymSet(_synonymSet);
		}

		public SynonymSetBuilder id(String id) {
			_synonymSet._id = id;

			return this;
		}

		public SynonymSetBuilder index(String index) {
			_synonymSet._index = index;

			return this;
		}

		public SynonymSetBuilder synonyms(String synonyms) {
			_synonymSet._synonyms = synonyms;

			return this;
		}

		private final SynonymSet _synonymSet;

	}

	private SynonymSet() {
	}

	private String _id;
	private String _index;
	private String _synonyms;

}