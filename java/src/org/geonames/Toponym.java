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

	private int geonameId;

	private String name;

	private String alternateNames;

	private String countryCode;

	private String countryName;

	private int population;

	private int elevation;

	private String featureClass;

	private String featureClassName;

	private String featureCode;

	private String featureCodeName;

	private double latitude;

	private double longitude;

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
	public String getFeatureClass() {
		return featureClass;
	}

	/**
	 * @param featureClass
	 *            The featureClass to set.
	 */
	public void setFeatureClass(String featureClass) {
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
	 * @return Returns the geonameId.
	 */
	public int getGeonameId() {
		return geonameId;
	}

	/**
	 * @param geonameId
	 *            The geonameId to set.
	 */
	public void setGeonameId(int geonameId) {
		this.geonameId = geonameId;
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

}
