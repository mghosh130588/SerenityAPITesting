package com.nuvino.cucumber.serenity;

import java.io.FileNotFoundException;

import com.nuvino.pojo.BINLookUpPojo;
import com.nuvino.pojo.BINLookUpResponsePojo;
import com.nuvino.pojo.badtextrequest;
import com.nuvino.pojo.postbadtextresponse;
import com.nuvino.utility.ReusableSpecification;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class BinLookupSteps {
	
	@Step("BIN Lookup API with BIN value :{0}")
	public BINLookUpResponsePojo BinLookUp(String Bin) throws FileNotFoundException {
		
		BINLookUpResponsePojo binresp;
		
		BINLookUpPojo b = new BINLookUpPojo();
		//b.setContent(content);
		//b.setCensorcharacter(cencoredcharacter);
		b.setBin(Bin);
		
		binresp =  SerenityRest.given().log().all()
		.spec(ReusableSpecification.getRequestSpec())
		.body(b)
		.post("/bin-lookup").then().log().all()
		.spec(ReusableSpecification.getResponseSpec()).extract().as(BINLookUpResponsePojo.class);
		return binresp;
	}

}
