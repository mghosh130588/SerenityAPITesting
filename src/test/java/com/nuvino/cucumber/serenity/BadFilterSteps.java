package com.nuvino.cucumber.serenity;

import java.io.FileNotFoundException;

import com.nuvino.pojo.badtextrequest;
import com.nuvino.pojo.postbadtextresponse;
import com.nuvino.utility.ReusableSpecification;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BadFilterSteps {
	
	@Step("Bad Text Filter API with content :{0}, cencored character : {1}")
	public postbadtextresponse Badfiltertest(String content,String cencoredcharacter) throws FileNotFoundException {
		
		badtextrequest b = new badtextrequest();
		b.setContent(content);
		b.setCensorcharacter(cencoredcharacter);
		
		postbadtextresponse bs = SerenityRest.given().log().all()
		.spec(ReusableSpecification.getRequestSpec())
		.body(b)
		.post("/bad-word-filter").then().log().all()
		.spec(ReusableSpecification.getResponseSpec()).extract()
		.as(postbadtextresponse.class);
		
		return bs;
	}

}
