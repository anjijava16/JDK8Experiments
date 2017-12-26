package com.iws.lamdba.expression2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GoogleLambdaExpresssion {

	public static void main(String[] args) {

		GoogleGeoLocation googleLocation1 = new GoogleGeoLocation(310, 410,
				"gsm", "Vodafone");

		GoogleGeoLocation googleLocation2 = new GoogleGeoLocation(222, 777,
				"gprs", "Verizon");

		GoogleGeoLocation googleLocation3 = new GoogleGeoLocation(111, 234,
				"gsm", "Sprint");

		GoogleGeoLocation googleLocation4 = new GoogleGeoLocation(345, 567,
				"gprs", "Us Cell");

		List<GoogleGeoLocation> gLocations = new ArrayList<GoogleGeoLocation>();
		gLocations.add(googleLocation1);
		gLocations.add(googleLocation2);
		gLocations.add(googleLocation3);
		gLocations.add(googleLocation4);

		
		List<MyLocation> myLocations = gLocations.stream()
	            .map(externalToMyLocation)
	            .collect(Collectors.<MyLocation> toList());
	
	}
}
