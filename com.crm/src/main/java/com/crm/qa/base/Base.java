package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.utils.Config;
import com.crm.qa.utils.DriverManager;

public class Base {

	protected  WebDriver driver;
	
	public Base()
	{
		 this.driver = DriverManager.getInstance().getDriver();
	       PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void waitForElement(FindBy element)
	{
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(4));
	 wait.until(ExpectedConditions.visibilityOf((WebElement) element));	
	}
	
	public void waitForElementUsingPoolingFreq(FindBy element)
	{
		FluentWait wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);				
	}
	
}
