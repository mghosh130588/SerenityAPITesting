package com.nuvino.cucumber.steps;

import java.io.FileNotFoundException;

import com.nuvino.cucumber.serenity.BadFilterSteps;
import com.nuvino.pojo.badtextrequest;
import com.nuvino.pojo.postbadtextresponse;
import com.nuvino.utility.ReusableSpecification;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;

public class NuvinoAppSteps {
	
	@Steps
	BadFilterSteps cbs;
	
	public postbadtextresponse cbres;
	
	
	//User sends a POST request to the API endpoint for a text to check profanity,the endpoint  must return valid status code 200 with the censored content
	@When("^User sends a POST request$")
	public void verifystatuscodebadfiltertest() throws FileNotFoundException {
		String content =  "Test";
		String cc = "@";
		cbres = cbs.Badfiltertest(content, cc);
		System.out.println(cbres.getCensoredContent());	
	}
//User sends a POST request without any value for parameter status code 400 is returned
	@When("^User sends a POST request without any value for parameter status code 400 is returned$")
	public void requestwithoutcontent() throws FileNotFoundException {
		String content = "";
		String censoredc = "";
		badtextrequest b = new badtextrequest();
		b.setContent(content);
		b.setCensorcharacter(censoredc);
		 String res = SerenityRest.rest().given().log().all()
		.spec(ReusableSpecification.getRequestSpec()).body(b)
		.post("/bad-word-filter")
		.then().log().all().statusCode(400).extract().asString();
		JsonPath js = new JsonPath(res);
		System.out.println("The error is as " +js.get("api-error-msg").toString());
		 
	}
	
	//User sends a POST request with a invalid api-key and valid userid and required valid parameter
	@When("^User sends a POST request with a invalid api-key and valid userid and required valid parameter$")
	public void requestwithinvalidkey() {
		
		String content = "test";
		String censoredc = "@";
		badtextrequest b = new badtextrequest();
		b.setContent(content);
		b.setCensorcharacter(censoredc);
		String res = SerenityRest.rest().given().log().all()
		.queryParams("user-id","mghosh","api-key","o7Wn8J8rUA7AQpTQjXVKFU5AYFQiPA0zUBHGSBa0s4v4N").header("Content-Type","application/json")
		.body(b)
		.post("/bad-word-filter")
		.then().log().all().statusCode(403).extract().asString();
		JsonPath js = new JsonPath(res);
		System.out.println("The error is as " +js.get("api-error-msg").toString());
		
	}
	//User sends the POST request with the information for content <content> and cencored character <cencoredcharac> and response with Status code 200 received
	@When("^User sends the POST request with the information for content (.*) and cencored character (.*) and response with Status code 200 received$")
	public void requestformultipledata(String content,String CC) throws FileNotFoundException {
		
		cbres = cbs.Badfiltertest(content, CC);
		
	}
	
	//Then Display cencored content on console
	@Then("^Display cencored content on console$")
	public void displaycencoredcontent() {
		
		System.out.println(cbres.getCensoredContent());
	}
	
	//User sends a POSt request to BIN Look Up API with a Valid BIN
	@When("^User sends a POSt request to BIN Look Up API with a Valid BIN$")
	public void BINLookUPres() {
		SerenityRest.given().log().all().queryParams("user-id","mghosh","api-key","st2o7Wn8J8rUA7AQpTQjXVKFU5AYFQiPA0zUBHGSBa0s4v4N").header("Content-Type","application/json")
		.body("{\"bin-number\":\"45178\"}").when().post("/bin-lookup")
		.then().log().all().statusCode(200);
	}
}
