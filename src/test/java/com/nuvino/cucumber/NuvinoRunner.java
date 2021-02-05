package com.nuvino.cucumber;

import org.junit.runner.RunWith;

import com.nuvino.testbase.RequestbuilderTest;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/",
glue="com.nuvino.cucumber.steps")
public class NuvinoRunner extends RequestbuilderTest{
	
	

}
