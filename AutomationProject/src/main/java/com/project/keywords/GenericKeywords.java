package com.project.keywords;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericKeywords 
{
	public WebDriver driver;

	public void openBrowser(String browserName)
	{
		System.out.println("Opening the Browser : " + browserName);
		
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
	}
	
	public void navigate(String url)
	{
		System.out.println("Navigate to :-" + url);
		driver.get(url);
	}
	
	public void click(String locator)
	{
		//driver.findElement(By.id(locator)).click();
		getElement(locator).click();
	}
	
	public void type(String locator,String text)
	{
		//driver.findElement(By.id(locator)).sendKeys(text);
		getElement(locator).sendKeys(text);
	}
	
	public void select(String locator,String option)
	{
		
	}
	
	public void getText(String locator)
	{
		
	}
	
	public WebElement getElement(String locator)
	{
		//check the presence of element
		if(!isElementPresent(locator)) {
			//report the failure
			System.out.println("Element is not present :-" + locator);
		}
		
		//check the visibility of element
		if(!isElementVisible(locator)) {
			//report the failure
			System.out.println("Element is not visible :- " + locator);
		}
		
		WebElement e = driver.findElement(By.id(locator));
		return e;
	}

	public boolean isElementVisible(String locator) 
	{
		System.out.println("Checking the visibility of Element :-" + locator);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		}catch (Exception e) {
			return false;
		}
		return true;
	}

	public boolean isElementPresent(String locator) 
	{
		System.out.println("Checking the Presence of Element :-" + locator);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	
}
