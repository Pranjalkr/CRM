package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.utils.Config;
import com.crm.qa.utils.DriverManager;

public class Base {

	protected  static WebDriver driver;
	protected Actions action;
	protected WebDriverWait wait;
	
	protected Base()
	{
		 driver = DriverManager.getInstance().getDriver();
	       PageFactory.initElements(driver, this);
	       action= new Actions(driver);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void waitForElementExplicitly(WebElement element)
	{
	wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	public void waitForElementUsingPoolingFreq(By locator)
	{
		FluentWait<WebDriver> wait=new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void SelectDropDownItem(WebElement commonElement,String option)
	{
		Select select = new Select(commonElement);
		select.deselectByValue(option);	
	}
	
}
