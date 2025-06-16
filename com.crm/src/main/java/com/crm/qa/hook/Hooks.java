package com.crm.qa.hook;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.qa.utils.Config;
import com.crm.qa.utils.DriverManager;

import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void SetUp()
	{
		DriverManager.getInstance().initDriver();	
		DriverManager.getInstance().getDriver().get(Config.getProperty("url"));
	}
	
}
