package com.techshop.runner;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.techshop.base.Base;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/Cart.feature"},
		glue = {"com.techshop.stepdef","com.techshop.hooks"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		dryRun = false
		//monochrome = true
		//tags = "@Test1"
			
		)

public class Runner extends AbstractTestNGCucumberTests{
//	@Parameters("browserType")
//	@BeforeClass
//	public static void beforeClass(@Optional("chrome") String browser) throws IOException {
//		Base.initializeProperties();
//		Base.property.setProperty("BrowserType", browser);
		
	
	
//	@AfterClass
//public static void AfterClass() {
//		
//	}

}
