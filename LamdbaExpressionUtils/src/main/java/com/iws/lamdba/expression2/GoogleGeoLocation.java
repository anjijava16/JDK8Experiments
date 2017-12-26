package com.iws.lamdba.expression2;

public class GoogleGeoLocation {

	private Integer homeMobileCountryCode;
	private Integer homeMobileNetworkCode;
	private String radioType;
	private String carrier;

	public GoogleGeoLocation(Integer homeMobileCountryCode,
			Integer homeMobileNetworkCode, String radioType, String carrier) {
		this.homeMobileCountryCode = homeMobileCountryCode;
		this.homeMobileNetworkCode = homeMobileNetworkCode;
		this.radioType = radioType;
		this.carrier = carrier;
	}

	public Integer getHomeMobileCountryCode() {
		return homeMobileCountryCode;
	}

	public void setHomeMobileCountryCode(Integer homeMobileCountryCode) {
		this.homeMobileCountryCode = homeMobileCountryCode;
	}

	public Integer getHomeMobileNetworkCode() {
		return homeMobileNetworkCode;
	}

	public void setHomeMobileNetworkCode(Integer homeMobileNetworkCode) {
		this.homeMobileNetworkCode = homeMobileNetworkCode;
	}

	public String getRadioType() {
		return radioType;
	}

	public void setRadioType(String radioType) {
		this.radioType = radioType;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

}