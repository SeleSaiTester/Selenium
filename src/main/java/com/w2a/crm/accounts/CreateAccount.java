package com.w2a.crm.accounts;


import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccount extends Page{

	public void createname(String name) throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(name);;
	}
}
