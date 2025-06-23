package com.crm.qa.pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;

import com.crm.qa.base.Base;
import com.crm.qa.utils.Config;

public class LoginPage extends Base{

	@FindBy(xpath="//Input[@name='email']")
	WebElement userName;
	
	@FindBy(xpath="//Input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginButton;
	
	@FindBy(xpath="//div[@class='header item']")
	By homePageLogo;
	
	
	public HomePage SignIn()
	{
		userName.sendKeys(Config.getProperty("UserName"));
		password.sendKeys(Config.getProperty("Password"));
		loginButton.click();
		//waitForElementUsingPoolingFreq(homePageLogo);
		Assert.assertEquals(getPageTitle(),"Cogmento CRM");
//		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
//		wait.until(ExpectedConditions.titleIs("Cogmento CRM"));	
		return new HomePage();
	}
}
