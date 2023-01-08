package com.smarttechqa.api;

import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ProductApiStepDef {
	
	 Response response;
	 static String token;
	
	static String domain = "https://www.smarttechqa.com";

@Given("User generates a token")
public void user_generates_a_token() {
	
	RestAssured.baseURI=domain;
	RequestSpecification req = RestAssured.given(); 
	req.header ("Content-Type", "application/json");
  
	Map<String, String> userData = new LinkedHashMap <> (); 
	userData.put("email", "apiuser@email.com"); 
	userData.put("password", "api123");
	
	JSONObject obj = new JSONObject (userData); 
	String json = obj.toJSONString(); 
  
	  response = req.body (json).request (Method. POST, "/api/users/login");
 
  token = response.jsonPath().get("token");
 System.out.println("The token value is :" +token);
  
  
	
   
}

@When("Get method is used for endpoint")
public void get_method_is_used_for_endpoint() {
	  RestAssured.baseURI=domain;
	  RequestSpecification req = RestAssured.given();
	  
   
}

@Then("All the products are retrieved")
public void all_the_products_are_retrieved() {
  
   
}

@Then("The status code is {int} Ok")
public void the_status_code_is_ok(Integer int1) {
  
   
}

@Then("The response time is below {int} ms")
public void the_response_time_is_below_ms(Integer int1) {
  
   
}

@When("Post method is used for endpoint")
public void post_method_is_used_for_endpoint() {
  
   
}

@Then("Sample product is posted to the application")
public void sample_product_is_posted_to_the_application() {
  
   
}

@Then("The status code is {int} Created")
public void the_status_code_is_created(Integer int1) {
  
   
}

@When("Put method is used for endpoint")
public void put_method_is_used_for_endpoint() {
  
   
}

@Then("Sample product is updated in the application")
public void sample_product_is_updated_in_the_application() {
  
   
}

@When("Delete method is used for endpoint")
public void delete_method_is_used_for_endpoint() {
  
   
}

@Then("Sample product is removed from the application")
public void sample_product_is_removed_from_the_application() {
  
   
}


}
