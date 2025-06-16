package com.crm.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Base;
import com.crm.qa.utils.Config;

public class LoginPage extends Base{

	@FindBy(xpath="")
	WebElement userName;
	
	@FindBy(xpath="")
	WebElement password;
	
	@FindBy(xpath="")
	WebElement loginButton;
	
	public HomePage SignIn()
	{
		userName.sendKeys(Config.getProperty("UserName"));
		password.sendKeys(Config.getProperty("Password"));
		loginButton.click();
		return new HomePage();
	}
}
