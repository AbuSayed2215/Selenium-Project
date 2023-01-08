package com.techshop.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.techshop.base.Base;

public class Elements extends Base{

	public Elements(){
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	@FindBy(xpath = "//*[@type='email']")
	@CacheLookup
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	
	@FindBy(id = "password")
	@CacheLookup
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(name = "q")
	@CacheLookup
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}
	@FindBy(xpath = "//*[text()='Airpods Wireless Bluetooth Headphones']")
	@CacheLookup
	private WebElement airpods;

	public WebElement getAirpods() {
		return airpods;
	}
	
	@FindBy(xpath = "(//*[text()='Airpods Wireless Bluetooth Headphones'])[2]")
	private WebElement airpodsPage;

	public WebElement getAirpodsPage() {
		return airpodsPage;
	}
	
}
