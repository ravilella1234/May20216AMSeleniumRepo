package pom;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class POM_001 
{
	WebDriver driver;
	LoginPage page;
  
  @BeforeMethod
  public void startProcess() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/");
  }
  
  @Test
  public void loginTest() throws Exception 
  {
	  page = new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyLogin(), "Authentication failed.");
  }
  
  

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}
