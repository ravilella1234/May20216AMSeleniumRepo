package assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import demogroup.SampleProject.BaseTest;

public class HardAssertion extends BaseTest
{
	
	
  @BeforeMethod
  @Parameters("browser")
  public void startProcess(String bType) throws Exception
  {
	    init();
		test = report.startTest("TNG_001");
		test.log(LogStatus.INFO, "loading the Properties files.....");
				
		launch(bType);
		test.log(LogStatus.PASS, "Launching the Brrowser : " + bType);
				
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProp.getProperty("amazonurl"));
  }
	
  @Test
  public void f() 
  {
	  String actualTitle = driver.getTitle();
	  String expectedTilte = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.i";
	  Assert.assertEquals(actualTitle, expectedTilte, "Titles are not equal....");
	  
	  
	  
	  String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
	  String expectedLink = "Customer Servic";
	  
	 //Assert.assertEquals(actualLink, expectedLink);
	// Assert.assertEquals(actualLink, expectedLink, "Both links are not equal...");
	  
	 // Assert.assertTrue(actualLink.equals(expectedLink));
	  Assert.assertTrue(actualLink.equals(expectedLink), "Both links are not equal...");
	  
	  driver.findElement(By.linkText("Customer Service")).click();
  }
  
  @AfterMethod
  public void endProcess()
  {
	  report.endTest(test);
	  report.flush();
	  
	  driver.quit();
  }
}
