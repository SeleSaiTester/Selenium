package com.w2a.base;

import org.openqa.selenium.By;

import com.w2a.crm.accounts.CreateAccount;

// Every page has TopMenu 

public class TopMenu extends Page{

	public void goToLeads() {

	}
	public void goToContacts() {

	}
	public CreateAccount goToAccounts() {// responsible for taking us to accounts page 
		
	driver.findElement(By.xpath("//div[@data-zcqa='tab_Accounts']")).click();
	return new CreateAccount();
	
	}
	public void signout() {

	}
	public void goToActivities() {

	}
	public void goToReports() {

	}
}
