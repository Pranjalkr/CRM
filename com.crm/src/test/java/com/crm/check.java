//package com.crm;
//
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import com.crm.qa.base.Base;
//import com.crm.qa.hook.Hooks;
//import com.crm.qa.pageObjects.LandingPage;
//import com.crm.qa.utils.DriverManager;
//
//public class check extends Base{
//
//	private WebDriver driver;
//    private LandingPage landingPage;
//    
//	 @BeforeMethod
//	    public void setUp() {
//		 Hooks h= new Hooks();
////		 h.SetUp();
////		 h.LaunchUrl();
//	       // DriverManager.getInstance().initDriver();
//	        driver = DriverManager.getInstance().getDriver();
//	        //driver.get("https://yourapplicationurl.com");
//	       // landingPage = new LandingPage(driver);
//	    }
//	 
//	@Test
//	public void a()
//	{
//		
//		landingPage.login();
//	}
//}
