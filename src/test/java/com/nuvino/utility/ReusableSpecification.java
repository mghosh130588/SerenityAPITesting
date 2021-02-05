package com.nuvino.utility;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static org.hamcrest.Matchers.*;

public class ReusableSpecification {
	
	public static RequestSpecBuilder rspec;
	public static RequestSpecification requestspecification;
	
	public static ResponseSpecBuilder resprec;
	public static ResponseSpecification responsespecification;
	public static String userid ;
	public static String key ;
	 public static ArrayList <String> ac;
	
	public static void setlist() throws FileNotFoundException {
		ac = AddQueryParamfromCSV.getapikeysfromcsv();
		userid = ac.get(0);
		key = ac.get(1);
		
	
	}
	
	public static RequestSpecification getRequestSpec() throws FileNotFoundException {

		ReusableSpecification.setlist();
		rspec = new RequestSpecBuilder();
		rspec.setContentType(ContentType.JSON).addQueryParam("user-id",userid).addQueryParam("api-key",key).addHeader("Content-Type","application/json");
		requestspecification = rspec.build();	
		return requestspecification;
	}
	
	public static ResponseSpecification  getResponseSpec() {
		
		resprec = new ResponseSpecBuilder();
		resprec.expectContentType(ContentType.JSON).expectStatusCode(200).expectHeader("Server","Neutrino-API");
		resprec.expectResponseTime(lessThan(5L),TimeUnit.SECONDS);
		responsespecification = resprec.build();
		
		return responsespecification;
	}

}
