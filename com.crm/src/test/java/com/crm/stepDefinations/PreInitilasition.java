package com.crm.stepDefinations;

import com.crm.qa.pageObjects.LandingPage;

import io.cucumber.java.en.Given;

public class PreInitilasition {

	LandingPage landingPage;
	
	 public PreInitilasition() {
		landingPage= new LandingPage();
	}
	 
	@Given("open the browser")
	public void I_Landed()
	{
		System.out.println("pre request should triger automaticcally");
	}
	
	@Given("I click on loginbutton")
	public void landingaPage() throws InterruptedException
	{
		
		landingPage.login();
	}

	@Given("^Enter UserName <username> and Password <password>$")
	public void enterUserNameUsernameAndPasswordPassword(String username, String password ) throws Throwable {
		
	}
}
