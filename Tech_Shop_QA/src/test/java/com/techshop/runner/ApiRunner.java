package com.techshop.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"Features/ProductAPI.feature"},
		glue = {"com.smarttechqa.api"}, 
		plugin = {"pretty","json:target/cucumber.json"},
		//dryRun = false,
		monochrome = true
		//tags = "@Test1"
			
		)
public class ApiRunner extends AbstractTestNGCucumberTests{
	

}
