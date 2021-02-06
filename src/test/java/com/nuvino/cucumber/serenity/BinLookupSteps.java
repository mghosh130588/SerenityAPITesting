package com.nuvino.cucumber.serenity;

import java.io.FileNotFoundException;

import com.nuvino.pojo.BINLookUpPojo;
import com.nuvino.pojo.badtextrequest;
import com.nuvino.pojo.postbadtextresponse;
import com.nuvino.utility.ReusableSpecification;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BinLookupSteps {
	
	@Step("BIN Lookup API with BIN value :{0}")
	public void BinLookUp(String Bin) throws FileNotFoundException {
		
		BINLookUpPojo b = new BINLookUpPojo();
		//b.setContent(content);
		//b.setCensorcharacter(cencoredcharacter);
		b.setBin(Bin);
		
		 SerenityRest.given().log().all()
		.spec(ReusableSpecification.getRequestSpec())
		.body(b)
		.post("/bin-lookup").then().log().all()
		.spec(ReusableSpecification.getResponseSpec()).extract().asString();
		
	}

}
