package com.project.Base;

import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.project.keywords.ApplicationKeywords;

public class BaseTest 
{
	public ApplicationKeywords app;
	public int i;
		
	@BeforeTest
	public void beforeTest(ITestContext context) throws Exception
	{
		System.out.println("----------------  Before Test ---------------");
		//init  & share it with all tests
		app = new ApplicationKeywords();// 1 app keyword object for entire test - All test
		context.setAttribute("app", app);
	}
	
	@BeforeMethod
	public void beforeMethod(ITestContext context)
	{
		System.out.println("**** Before Method ****");
		app = (ApplicationKeywords) context.getAttribute("app");
	}

}
