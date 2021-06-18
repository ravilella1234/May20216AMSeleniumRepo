package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class DataManagentFinalVersion 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> td) 
  {
	  if(td.get("RunMode").equals("N"))
		  throw new SkipException("Testcase is Skipped as set-to No...");
	 
	  System.out.println(td.get("UserName"));
	  System.out.println(td.get("Pasword"));
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 3PM Batch Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	  
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(td.get("UserName"));
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(td.get("Pasword"));
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\suitea.xlsx");
		String  sheetName = "Data";
		String testCaseName = "LoginTest";
	  
	    return DataUtils.getTestData(e, sheetName, testCaseName);
  }
}
