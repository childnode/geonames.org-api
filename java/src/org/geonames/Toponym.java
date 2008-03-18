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
 * a toponym
 * 
 * @author marc@geonames
 * 
 */
public class Toponym {

	private int geoNameId;

	private String name;

	private String alternateNames;

	private String countryCode;

	private String countryName;

	private int population;

	private int elevation;

	private FeatureClass featureClass;

	private String featureClassName;

	private String featureCode;

	private String featureCodeName;

	private double latitude;

	private double longitude;

	private String adminCode1;
	
	private String adminName1;

	private String adminCode2;
	
	private String adminName2;

	private String adminCode3;

	private String adminCode4;

	private Timezone timezone;

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
	 * @return Returns the elevation.
	 */
	public int getElevation() {
		return elevation;
	}

	/**
	 * @param elevation
	 *            The elevation to set.
	 */
	public void setElevation(int elevation) {
		this.elevation = elevation;
	}

	/**
	 * @return Returns the featureClass.
	 */
	public FeatureClass getFeatureClass() {
		return featureClass;
	}

	/**
	 * @param featureClass
	 *            The featureClass to set.
	 */
	public void setFeatureClass(FeatureClass featureClass) {
		this.featureClass = featureClass;
	}

	/**
	 * @return Returns the featureCode.
	 */
	public String getFeatureCode() {
		return featureCode;
	}

	/**
	 * @param featureCode
	 *            The featureCode to set.
	 */
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	/**
	 * @return Returns the latitude.
	 */
	public double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            The latitude to set.
	 */
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return Returns the longitude.
	 */
	public double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            The longitude to set.
	 */
	public void setLongitude(double longitude) {
		this.longitude = longitude;
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
	 * @return Returns the population.
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population
	 *            The population to set.
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	/**
	 * @return Returns the geoNameId.
	 */
	public int getGeoNameId() {
		return geoNameId;
	}

	/**
	 * @param geoNameId
	 *            The geoNameId to set.
	 */
	public void setGeoNameId(int geonameId) {
		this.geoNameId = geonameId;
	}

	/**
	 * @return Returns the featureClassName.
	 */
	public String getFeatureClassName() {
		return featureClassName;
	}

	/**
	 * @param featureClassName
	 *            The featureClassName to set.
	 */
	public void setFeatureClassName(String featureClassName) {
		this.featureClassName = featureClassName;
	}

	/**
	 * @return Returns the featureCodeName.
	 */
	public String getFeatureCodeName() {
		return featureCodeName;
	}

	/**
	 * @param featureCodeName
	 *            The featureCodeName to set.
	 */
	public void setFeatureCodeName(String featureCodeName) {
		this.featureCodeName = featureCodeName;
	}

	/**
	 * @return Returns the countryName.
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName
	 *            The countryName to set.
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the alternateNames as comma separated list
	 */
	public String getAlternateNames() {
		return alternateNames;
	}

	/**
	 * @param alternateNames
	 *            the alternateNames to set
	 */
	public void setAlternateNames(String alternateNames) {
		this.alternateNames = alternateNames;
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("geoNameId=" + geoNameId + ",");
		str.append("name=" + name + ",");
		if (alternateNames != null) {
			str.append("alternateNames=" + alternateNames + ",");
		}
		str.append("latitude=" + latitude + ",");
		str.append("longitude=" + longitude + ",");
		str.append("countryCode=" + countryCode + ",");
		str.append("population=" + population + ",");
		str.append("elevation=" + elevation + ",");
		str.append("featureClass=" + featureClass + ",");
		str.append("featureCode=" + featureCode);
		return str.toString();
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

	/**
	 * @return the adminCode2
	 */
	public String getAdminCode2() {
		return adminCode2;
	}

	/**
	 * @param adminCode2
	 *            the adminCode2 to set
	 */
	public void setAdminCode2(String adminCode2) {
		this.adminCode2 = adminCode2;
	}

	/**
	 * @return the adminCode3
	 */
	public String getAdminCode3() {
		return adminCode3;
	}

	/**
	 * @param adminCode3
	 *            the adminCode3 to set
	 */
	public void setAdminCode3(String adminCode3) {
		this.adminCode3 = adminCode3;
	}

	/**
	 * @return the adminCode4
	 */
	public String getAdminCode4() {
		return adminCode4;
	}

	/**
	 * @param adminCode4
	 *            the adminCode4 to set
	 */
	public void setAdminCode4(String adminCode4) {
		this.adminCode4 = adminCode4;
	}

	/**
	 * @return the timezone
	 */
	public Timezone getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone
	 *            the timezone to set
	 */
	public void setTimezone(Timezone timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the adminName1
	 */
	public String getAdminName1() {
		return adminName1;
	}

	/**
	 * @param adminName1
	 *            the adminName1 to set
	 */
	public void setAdminName1(String adminName1) {
		this.adminName1 = adminName1;
	}

	/**
	 * @return the adminName2
	 */
	public String getAdminName2() {
		return adminName2;
	}

	/**
	 * @param adminName2
	 *            the adminName2 to set
	 */
	public void setAdminName2(String adminName2) {
		this.adminName2 = adminName2;
	}

}
