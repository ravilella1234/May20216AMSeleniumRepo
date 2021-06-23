package pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demogroup.SampleProject.BaseTest;

public class POM_001  extends BaseTest
{
	//WebDriver driver;
	LoginPage page;
	CustomerRegistration reg; 
  
  @BeforeMethod
  public void startProcess() throws Exception 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/");
	  init();
	  //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }
  
  @Test(enabled = false)
  public void loginTest() throws Exception 
  {
	  page = new LoginPage(driver);
	  page.customerLogin();
	  Assert.assertEquals(page.verifyLogin(), "Authentication failed.");
  }
  
  @Test
  public void registrationTest() throws Exception
  {
	  reg = new CustomerRegistration(driver);
	  reg.customerRegistration();
  }
  
  

  @AfterMethod
  public void endProcess() 
  {
	  
  }

}
