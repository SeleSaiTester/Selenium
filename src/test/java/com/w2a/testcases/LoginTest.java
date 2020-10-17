package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.crm.accounts.CreateAccount;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.testcases.BaseTest;
import com.w2a.utilities.Utilities;
public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Utilities.class,dataProvider = "dp")
	public void logintest(Hashtable<String,String> data)  {
	HomePage home= new HomePage();
	LoginPage lp=home.gotoLogin();
	try {
		ZohoAppPage zp=lp.doLogin(data.get("username"), data.get("password"));
		zp.goToCRM();
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
