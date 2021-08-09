package com.project.Base;

import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.project.keywords.ApplicationKeywords;
import com.reports.ExtentManager;

// acceptable failure, critical failure, unexpected failure

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
		app.setReport(test);
		
		context.setAttribute("report", rep);
		context.setAttribute("test", test);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("**** Before Method ****");
		
		String criticalFailure = (String)context.getAttribute("criticalFailure");
		if(criticalFailure!=null && criticalFailure.equals("Y"))
		{
			test.log(Status.SKIP, "Critical Failure in previous Tests");
			new SkipException("Critical Failure in previous Tests"); //Test skips in TestNG
		}
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
