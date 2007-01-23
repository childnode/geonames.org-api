/*
 * Copyright 2006 Marc Wick, geonames.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.geonames;

/**
 * search criteria for web services returning toponyms
 * 
 * @author marc@geonames
 * 
 */
public class ToponymSearchCriteria {

	private String q;

	private String countryCode;

	private String name;

	private String nameEquals;

	private String nameStartsWith;

	private String tag;

	private String language;

	private Style style;

	private String featureClass;

	private String[] featureCodes;

	private String adminCode1;

	private int maxRows;

	private int startRow;

	/**
	 * @return Returns the countryCode.
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 *            The countryCode to set.
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * @return Returns the nameEquals.
	 */
	public String getNameEquals() {
		return nameEquals;
	}

	/**
	 * @param nameEquals
	 *            The nameEquals to set.
	 */
	public void setNameEquals(String exactName) {
		this.nameEquals = exactName;
	}

	/**
	 * @return Returns the featureCodes.
	 */
	public String[] getFeatureCodes() {
		return featureCodes;
	}

	/**
	 * @param featureCodes
	 *            The featureCodes to set.
	 */
	public void setFeatureCodes(String[] featureCodes) {
		this.featureCodes = featureCodes;
	}

	/**
	 * @return Returns the language.
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language
	 *            The language to set.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return Returns the maxRows.
	 */
	public int getMaxRows() {
		return maxRows;
	}

	/**
	 * @param maxRows
	 *            The maxRows to set.
	 */
	public void setMaxRows(int maxRows) {
		this.maxRows = maxRows;
	}

	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Returns the q.
	 */
	public String getQ() {
		return q;
	}

	/**
	 * @param q
	 *            The q to set.
	 */
	public void setQ(String q) {
		this.q = q;
	}

	/**
	 * @return Returns the startRow.
	 */
	public int getStartRow() {
		return startRow;
	}

	/**
	 * @param startRow
	 *            The startRow to set.
	 */
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	/**
	 * @return Returns the style.
	 */
	public Style getStyle() {
		return style;
	}

	/**
	 * @param style
	 *            The style to set.
	 */
	public void setStyle(Style style) {
		this.style = style;
	}

	/**
	 * @return Returns the tag.
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag
	 *            The tag to set.
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	/**
	 * @return Returns the nameStartsWith.
	 */
	public String getNameStartsWith() {
		return nameStartsWith;
	}

	/**
	 * @param nameStartsWith
	 *            The nameStartsWith to set.
	 */
	public void setNameStartsWith(String nameStartsWith) {
		this.nameStartsWith = nameStartsWith;
	}

	/**
	 * @return the featureClass
	 */
	public String getFeatureClass() {
		return featureClass;
	}

	/**
	 * @param featureClass
	 *            the featureClass to set
	 */
	public void setFeatureClass(String featureClass) {
		this.featureClass = featureClass;
	}

	/**
	 * @return the adminCode1
	 */
	public String getAdminCode1() {
		return adminCode1;
	}

	/**
	 * @param adminCode1
	 *            the adminCode1 to set
	 */
	public void setAdminCode1(String adminCode1) {
		this.adminCode1 = adminCode1;
	}

}
