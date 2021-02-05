package com.nuvino.testbase;
import org.junit.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.RestAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestbuilderTest{
	
	//RestAssured.baseURI = "https://neutrinoapi.com";
	
	/*public  RequestSpecification req = new RequestSpecBuilder().setContentType(ContentType.JSON)
			.setBaseUri("https://neutrinoapi.com").addQueryParam("user-id","mghosh").addQueryParam("api-key","st2o7Wn8J8rUA7AQpTQjXVKFU5AYFQiPA0zUBHGSBa0s4v4N")
	.addHeader("Content-Type","application/json")
	.build();
	 
	public ResponseSpecification  res = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200)
			.build();

			*/

	@BeforeClass
	public static void init() {
		
		RestAssured.baseURI = "https://neutrinoapi.com";
		
	}
}
