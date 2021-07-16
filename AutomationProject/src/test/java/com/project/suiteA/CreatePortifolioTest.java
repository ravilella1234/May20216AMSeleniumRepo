package com.project.suiteA;

import org.testng.annotations.Test;

import com.project.keywords.ApplicationKeywords;

public class CreatePortifolioTest 
{
	
  @Test
  public void f() throws Exception 
  {
	  //login
	  //createPortifolio
	  //Verify
	  //GenericKeywords gKeywords = new GenericKeywords();
	  ApplicationKeywords app = new ApplicationKeywords();
	  //ValidationKeywords vKeywords = new ValidationKeywords();
	  
	  app.openBrowser("chromebrowser");
	  app.navigate("rediffurl");
	  app.type("username_css", "ravilella2021@rediffmail.com");
	  app.type("password_xpath", "Sai@2015");
	  app.click("login_submit_id");
	  
	  
	 // app.navigate("https://www.in.rediff.com");
	  //app.ValidateTitle();
	  //app.validateElementPresent();
	 // app.login();
  }
}
