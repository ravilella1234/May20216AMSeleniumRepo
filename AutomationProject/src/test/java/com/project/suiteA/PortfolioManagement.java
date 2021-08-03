package com.project.suiteA;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.project.Base.BaseTest;

public class PortfolioManagement extends BaseTest
{
	
	@Test
	public void createPortofolio(ITestContext context)
	{
		System.out.println("createPortofolio");
		System.out.println(i);
		System.out.println(context.getAttribute("i_val"));
	
		app.navigate("rediffurl");
	}
	
	@Test
	public void deletePortofolio()
	{
		System.out.println("deletePortofolio");
		
		
	}

}
