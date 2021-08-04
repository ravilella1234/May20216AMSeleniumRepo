package com.project.Base;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.keywords.ApplicationKeywords;
import com.reports.ExtentManager;

public class BaseTest 
{
	public ApplicationKeywords app;
	public int i;
	public ExtentReports rep;
	public ExtentTest test;
	
		
	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{
		System.out.println("----------------  Before Test ---------------");
		//init  & share it with all tests
		app = new ApplicationKeywords();// 1 app keyword object for entire test - All test
		context.setAttribute("app", app);
		
		//init the Reporting for the Test
		rep = ExtentManager.getReports();
		test = rep.createTest(context.getCurrentXmlTest().getName());
		test.log(Status.INFO, "Starting Test : "+ context.getCurrentXmlTest().getName());
		
		context.setAttribute("report", rep);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("**** Before Method ****");
		app = (ApplicationKeywords) context.getAttribute("app");
		rep = (ExtentReports)context.getAttribute("report");
		test = (ExtentTest)context.getAttribute("test");
	}
	
	@AfterTest
	public void quit()
	{
		if(rep!=null)
			rep.flush();
	}

}
