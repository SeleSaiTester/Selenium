package com.w2a.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class LoginPage extends Page{
	public ZohoAppPage doLogin(String username,String password) throws InterruptedException{

		click("login_CSS");
		type("sendusername_XPATH", username);
		Thread.sleep(6000);
		click("submit_XPATH");
		Thread.sleep(5000);
		type("password_XPATH", password);
		click("submit2_XPATH");
		return new ZohoAppPage();	
	}

	public void goToSignUp(){

	}
}