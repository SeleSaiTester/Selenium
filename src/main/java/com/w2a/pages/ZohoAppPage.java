package com.w2a.pages;
import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page {

	public CRMHomePage goToCRM() {
		driver.findElement(By.xpath("//*[@id='zl-myapps']/div[1]/div[7]")).click();	
		return new CRMHomePage();
	}
	public void goToChat() {
	}
	public void goToothers() {

	}
}
