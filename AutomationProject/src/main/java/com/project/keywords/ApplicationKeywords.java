package com.project.keywords;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;

public class ApplicationKeywords extends ValidationKeywords
{
	
	public ApplicationKeywords() throws Exception 
	{
		mainProp = new Properties();
		childProp = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(projectPath+"\\src\\test\\resources\\environment.properties");
			mainProp.load(fis);
			String e = mainProp.getProperty("env");
			System.out.println(e);
			
			fis = new FileInputStream(projectPath+"\\src\\test\\resources\\"+e+".properties");
			childProp.load(fis);
			System.out.println(childProp.getProperty("rediffurl"));
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		softAssert = new SoftAssert();
		
	}

	public void login()
	{
		
	}
	
	public void selectDateFormatCalendar()
	{
		
	}
	
	public void verifyStockAdded()
	{
		
	}
	
	public void setReport(ExtentTest test)
	{
		this.test=test;
	}

}
