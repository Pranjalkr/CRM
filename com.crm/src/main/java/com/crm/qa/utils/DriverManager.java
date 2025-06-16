package com.crm.qa.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static DriverManager instance;
	private static WebDriver driver;
	
	private DriverManager()
	{
		
	}
	
	public static DriverManager getInstance()
	{
		if(instance==null)
		{
			
				instance = new DriverManager();
			
		}
		return instance;
	}
	
	public void initDriver()
	{
		if(Config.getProperty("BrowserType").equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
			}
		getDriver().manage().window().maximize();
		
	}
	
	public WebDriver getDriver() {
		if(driver==null)
		{
			initDriver();
		}
		return driver;
	}
	 

}
