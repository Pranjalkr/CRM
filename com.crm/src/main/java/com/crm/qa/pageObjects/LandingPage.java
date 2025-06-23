package com.crm.qa.pageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Base;

public class LandingPage extends Base {


	@FindBy(xpath="//span[text()=' sign up']//parent::a")
	WebElement signUpButton;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement LoginButton;
	
	public void signUp() throws InterruptedException
	{
		System.out.println("i am not able to get driver");
		Thread.sleep(5000);
		signUpButton.click();
		
	}
	
	public LoginPage MoveToLoginWindow()
	{
		LoginButton.click();
		String parentWindow=driver.getWindowHandle();
		Set<String> window=driver.getWindowHandles();
		//Iterator<String> iterator=window.iterator();
		for(String a:window)
		{
			System.out.println(a);
			if(!a.equals(parentWindow))
			{
				driver=driver.switchTo().window(a);
				System.out.println("HelloWorld"+driver.getTitle());
			}
			
		}
		
		System.out.println("HelloWorld"+driver.getTitle());
		return new LoginPage();
	}
}
