package com.project.suiteA;

import org.testng.annotations.Test;

import com.project.keywords.ApplicationKeywords;

public class CreatePortifolioTest 
{
	
  @Test
  public void f() 
  {
	  //login
	  //createPortifolio
	  //Verify
	  //GenericKeywords gKeywords = new GenericKeywords();
	  ApplicationKeywords app = new ApplicationKeywords();
	  //ValidationKeywords vKeywords = new ValidationKeywords();
	  
	  app.openBrowser("chrome");
	  app.navigate("https://portfolio.rediff.com/portfolio-login");
	  app.type("useremail", "ravilella2021@rediff.com");
	  app.type("userpass", "Sai@2015");
	  app.click("loginsubmit");
	  
	  
	 // app.navigate("https://www.in.rediff.com");
	  //app.ValidateTitle();
	  //app.validateElementPresent();
	 // app.login();
  }
}
