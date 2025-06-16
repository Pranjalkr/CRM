package com.crm.qa.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class LandingPage extends Base {


	@FindBy(xpath="//span[text()=' sign up']//parent::a")
	WebElement signUpButton;
	
	@FindBy(xpath="//span[text()='Start Here']")
	WebElement LoginButton;
	
	public void signUp() throws InterruptedException
	{
		System.out.println("i am not able to get driver");
		Thread.sleep(5000);
		signUpButton.click();
	}
	
	public LoginPage login()
	{
		LoginButton.click();
		return new LoginPage();
	}
}
