package com.techshop.hooks;

import com.techshop.base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	@Before
	public static void initialize() {
		Base.setUp();
	}
	@After
public static void tearDown() {
	//driver.quit();
}
}
