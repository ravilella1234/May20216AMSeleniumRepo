package com.project.keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
		
	}
	
	public void click(String locator)
	{
		
	}
	
	public void type(String locator,String text)
	{
		
	}
	
	public void select(String locator,String option)
	{
		
	}
	
	public void getText(String locator)
	{
		
	}
	
	
}
