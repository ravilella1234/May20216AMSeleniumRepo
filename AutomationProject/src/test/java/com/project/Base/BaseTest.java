package com.project.Base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.project.keywords.ApplicationKeywords;

public class BaseTest 
{
	public ApplicationKeywords app;
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("----------------  Before Test ---------------");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("**************** Before Method ***************");
	}

}
