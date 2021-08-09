package com.project.suiteA;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.project.Base.BaseTest;

public class Session extends BaseTest
{
	
	@Test
	public void doLogin() throws Exception
	{
		test.log(Status.INFO, "Loggin In");
		app.openBrowser("chromebrowser");
		app.navigate("rediffurl");
		app.type("username_css", "ravilella2021@rediffmail.com");
		//failure
		app.reportFailure("First Failure - Non Critical ",false);
		app.type("password_xpath", "Sai@2015");
		app.validateElementPresent("login_submit_id");
		app.click("login_submit_id");
		
	}
	
	@Test
	public void doLogout() throws Exception
	{
		test.log(Status.INFO, "Logging Out");		
	}

}
