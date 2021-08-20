package com.project.keywords;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.reports.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GenericKeywords 
{
	public  WebDriver driver;
	public Properties mainProp;
	public Properties childProp;
	public String projectPath = System.getProperty("user.dir");
	public ExtentTest test;
	public SoftAssert softAssert;

	public void openBrowser(String browserName)
	{
		log("Opening the Browser : " + browserName);
		
		if(mainProp.getProperty(browserName).equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(mainProp.getProperty(browserName).equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	}
	
	public void navigate(String url)
	{
		log("Navigate to :-" + url);
		driver.get(childProp.getProperty(url));
	}
	
	public void click(String locatorKey)
	{
		log("Clicking on " +locatorKey);
		getElement(locatorKey).click();
	}
	
	public void type(String locatorKey,String text)
	{
		log("Typing text : " +locatorKey +" Data : " + text);
		getElement(locatorKey).sendKeys(text);
	}
	
	public void select(String locatorKey,String option)
	{
		
	}
	
	public void getText(String locatorKey)
	{
		
	}
	
	public WebElement getElement(String locatorKey)
	{
		//check the presence of element
		if(!isElementPresent(locatorKey)) {
			//report the failure
			System.out.println("Element is not present :-" + locatorKey);
		}
		
		//check the visibility of element
		if(!isElementVisible(locatorKey)) {
			//report the failure
			System.out.println("Element is not visible :- " + locatorKey);
		}
		
		WebElement e =null;
		if(locatorKey.endsWith("_id")) {
			e = driver.findElement(By.id((mainProp.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_name")) {
			e = driver.findElement(By.name((mainProp.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_xpath")) {
			e = driver.findElement(By.xpath((mainProp.getProperty(locatorKey))));
		}else if(locatorKey.endsWith("_css")) {
			e = driver.findElement(By.cssSelector((mainProp.getProperty(locatorKey))));
		}
		
		return e;
	}

	public boolean isElementVisible(String locatorKey) 
	{
		System.out.println("Checking the visibility of Element :-" + locatorKey);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		try{			
			if(locatorKey.endsWith("_id")){
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(mainProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_name")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(mainProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(mainProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_css")) {
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(mainProp.getProperty(locatorKey))));
			}
		}catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isElementPresent(String locatorKey) 
	{
		System.out.println("Checking the Presence of Element :-" + locatorKey);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
			if(locatorKey.endsWith("_id")){
				wait.until(ExpectedConditions.presenceOfElementLocated(By.id(mainProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_name")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name(mainProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_xpath")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(mainProp.getProperty(locatorKey))));
			}else if(locatorKey.endsWith("_css")) {
				wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(mainProp.getProperty(locatorKey))));
			}
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	//Reporting Function
	public void log(String msg)
	{
		test.log(Status.INFO, msg);
	}
	
	public void reportFailure(String failureMsg,boolean stopOnFailure)
	{
		System.out.println(failureMsg);
		test.log(Status.FAIL, failureMsg); //failure in Extent Reports
		takeScreenShot();
		softAssert.fail(failureMsg);  // failure in TestNG Reports
		
		if(stopOnFailure)
			assertAll(); // report all the failures
		
	}
	
	public void assertAll()
	{
		Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
		softAssert.assertAll();
	}
	
	public void takeScreenShot()
	{
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		
		// take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
			//put screenshot file in reports
			test.log(Status.INFO,"Screenshot-> "+ test.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+"//"+screenshotFile));
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
