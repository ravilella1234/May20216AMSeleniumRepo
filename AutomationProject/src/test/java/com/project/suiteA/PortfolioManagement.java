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
		app.reportFailure("Some non critical failure",false);
		app.assertAll();
	}
	
	@Test
	public void deletePortofolio()
	{
		test.log(Status.INFO, "deletePortofolio");
	}

}
