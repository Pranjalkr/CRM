package com.crm.qa.hook;

import java.time.Duration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.crm.qa.pageObjects.LandingPage;
import com.crm.qa.pageObjects.LoginPage;
import com.crm.qa.utils.Config;
import com.crm.qa.utils.DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public void SetUp()
	{
		DriverManager.getInstance().initDriver();	
		DriverManager.getInstance().getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		DriverManager.getInstance().getDriver().get(Config.getProperty("url"));
		LandingPage  landingPage= new LandingPage();
		LoginPage loginPage= landingPage.MoveToLoginWindow();
		loginPage.SignIn();
		
	}
	
//	@After
//	public void TearDown()
//	{
//		DriverManager.getInstance().getDriver().close();
//	}
	
}
