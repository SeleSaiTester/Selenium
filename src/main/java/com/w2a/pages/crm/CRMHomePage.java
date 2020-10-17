package com.w2a.pages.crm;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.crm.accounts.CreateAccount;

public class CRMHomePage extends Page{
	//Top_section is every where
	public CreateAccount gotocreateaccount(){
		driver.findElement(By.cssSelector("#table_row_1 > lyte-td.alignRight > span.customPluswithImpotBtnCon.pR.cPlusImportButton > link-to > button")).click();
		return new CreateAccount();
	}
}
