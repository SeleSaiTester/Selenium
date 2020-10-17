package com.w2a.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;

public class HomePage extends Page{


	//step:1 
	public LoginPage gotoLogin()  {
		driver.get("https://zoho.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(" Dummy Method ");
	return new LoginPage();
	}
	public void gotoSupport(){ 
		driver.findElement(By.xpath("//body/div[2]/div[2]/div[1]/a[2]")).click();
	}
	public void gotoSignUp() { 
		driver.findElement(By.xpath("//a[contains(text(),'Free Sign Up')]")).click();
	}


	public void customers()  { }
	public void contactsales() { }
}
