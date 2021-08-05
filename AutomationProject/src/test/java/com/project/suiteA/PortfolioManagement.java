package com.project.suiteA;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.project.Base.BaseTest;

public class PortfolioManagement extends BaseTest
{
	
	@Test
	public void createPortofolio()
	{
		test.log(Status.INFO, "createPortofolio");
	}
	
	@Test
	public void deletePortofolio()
	{
		test.log(Status.INFO, "deletePortofolio");
	}

}
