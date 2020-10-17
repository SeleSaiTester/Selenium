package com.w2a.testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.base.Page;

public class BaseTest  extends Page{
	// anything common is in this 
	@BeforeSuite
	void setup() {

	}
	@AfterSuite
	void teardown() {
if (!(driver==null)) {
	
		driver.quit();
}
	}

}
