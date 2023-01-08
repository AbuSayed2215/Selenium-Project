package com.techshop.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static Properties property;
	public static WebDriver driver;
	public static Logger logger;
	
	public Base() {
		logger = Logger.getLogger("Automation Testing");
		PropertyConfigurator.configure("src/test/resources/Log4j.properties");		
	}
	
	public static void initializeProperties() throws IOException {
		property = new Properties();
		InputStream ip = new FileInputStream("src/test/resources/config.properties");
		property.load(ip);
	}
	
	public static void setUp() {
		if(property.getProperty("BrowserType").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
			} else if (property.getProperty("BrowserType").equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if (property.getProperty("BrowserType").equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();	//This will delete user session information	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://www.smarttechqa.com/");

		
		//driver.findElement(By.linkText("Allow Cookies")).click();
	}
public static void main(String[] args) {
	//Base.setUp();
}
}
