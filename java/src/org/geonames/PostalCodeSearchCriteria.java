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
 * search criteria for web services returning postal codes
 * 
 * @author marc@geonames
 * 
 */
public class PostalCodeSearchCriteria {

	private String postalCode;

	private String placeName;

	private String countryCode;

	private Double latitude;

	private Double longitude;

	private Style style;

	private int maxRows;

	private boolean isOROperator = false;

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
	 * @return Returns the countryCode.
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 *            The countryCode to set.
	 */
	public void setCountryCode(String countryCode)
			throws InvalidParameterException {
		if (countryCode != null && countryCode.length() != 2) {
			throw new InvalidParameterException("invalid country code");
		}
		this.countryCode = countryCode;
	}

	/**
	 * @return Returns the latitude.
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            The latitude to set.
	 */
	public void setLatitude(double latitude) throws InvalidParameterException {
		if (latitude > 90.0 || latitude < -90.0) {
			throw new InvalidParameterException("invalid latitude " + latitude);
		}
		this.latitude = new Double(latitude);
	}

	/**
	 * @return Returns the longitude.
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            The longitude to set.
	 */
	public void setLongitude(double longitude) throws InvalidParameterException {
		if (longitude > 180.0 || longitude < -180.0) {
			throw new InvalidParameterException("invalid longitude "
					+ longitude);
		}
		this.longitude = new Double(longitude);
	}

	/**
	 * @return Returns the placeName.
	 */
	public String getPlaceName() {
		return placeName;
	}

	/**
	 * @param placeName
	 *            The placeName to set.
	 */
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	/**
	 * @return Returns the postalCode.
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            The postalCode to set.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @return the maxRows
	 */
	public int getMaxRows() {
		return maxRows;
	}

	/**
	 * @param maxRows
	 *            the maxRows to set
	 */
	public void setMaxRows(int maxRows) {
		this.maxRows = maxRows;
	}

	/**
	 * @param isOROperator
	 *            the isOROperator to set
	 */
	public void setOROperator(boolean isOROperator) {
		this.isOROperator = isOROperator;
	}

	/**
	 * @return the isOROperator
	 */
	public boolean isOROperator() {
		return isOROperator;
	}

}
