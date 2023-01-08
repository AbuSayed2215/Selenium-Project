package com.techshop.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.techshop.base.Base;
import com.techshop.element.Elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegetiveSteps extends Base {

	Elements pf = PageFactory.initElements(driver, Elements.class);
	
@Given("I open the browser and I navigate to the application")
public void i_open_the_browser_and_i_navigate_to_the_application() {
    
    
}

@When("I click on the sign in button on homepage")
public void i_click_on_the_sign_in_button_on_homepage() {
	driver.findElement(By.xpath("//a[@href='/login']")).click();
    
}

@When("I enter {string} and {string}")
public void i_enter_and(String email, String password) {
	driver.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys(password);
    
}

@When("I click on the login button")
public void i_click_on_the_login_button() {
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
    
}

@Then("I am suppose to get an error message")
public void i_am_suppose_to_get_an_error_message() {
   
	String expected = "Invalid email or password";
	String actual = driver.findElement(By.xpath("//div[@class='fade alert alert-danger show']")).getText();
	Assert.assertEquals(actual, expected);
    
}

}
