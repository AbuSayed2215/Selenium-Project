package com.techshop.stepdef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.techshop.base.Base;
import com.techshop.element.Elements;
import com.techshop.utilities.Utilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends Base{
	Elements pf = PageFactory.initElements(driver, Elements.class);
	

@Given("User opens the browser")
public void user_opens_the_browser() {
   
    
}
@Given("User navigates to {string}")
public void user_navigates_to(String string) {
   
    
}
@When("User clicks on the Sign In button")
public void user_clicks_on_the_sign_in_button() {
   
	driver.findElement(By.xpath("//*[@id=\"basic-navbar-nav\"]/div/a[3]")).click();
    
}
@When("User Enters the email")
public void user_enters_the_email() {
   driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");
    
}
@When("User Enters the password")
public void user_enters_the_password() {
	driver.findElement(By.id("password")).sendKeys("123456");
    
}
@When("User clicks on the login in button")
public void user_clicks_on_the_login_in_button() throws InterruptedException {
	
	Thread.sleep(3000);
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	Utilities.getExplicitWait(null, 0);
	
   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/form/button")).click();
    
}
@Then("The user is successfully logged in and username is displayed")
public void the_user_is_successfully_logged_in_and_username_is_displayed() {
   
    
}
@Then("User is navigated to home page")
public void user_is_navigated_to_home_page() {
   
    
}
@Then("I want to check user is able to pay for the item")
public void i_want_to_check_user_is_able_to_pay_for_the_item() {
   
    
}
@When("User clicks on the Search Box and Searches for {string}")
public void user_clicks_on_the_search_box_and_searches_for(String string) {
   
    
}

@When("User clicks on the Search Button")
public void user_clicks_on_the_search_button() {
   
    
}

@Then("User can search for the {string} item")
public void user_can_search_for_the_item(String string) {
   
    
}

@When("User clicks on the latest product from the homepage")
public void user_clicks_on_the_latest_product_from_the_homepage() {
   
    
}

@Then("User is able to view the item")
public void user_is_able_to_view_the_item() {
   
    
}

@When("User clicks on the cart button")
public void user_clicks_on_the_cart_button() {
   
    
}

@Then("User is navigated to the Cart Page")
public void user_is_navigated_to_the_cart_page() {
   
    
}

@Then("I can validate user payment")
public void i_can_validate_user_payment() {
   
    
}
	}