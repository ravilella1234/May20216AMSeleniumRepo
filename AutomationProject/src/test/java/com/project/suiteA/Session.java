package com.project.suiteA;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.project.Base.BaseTest;

public class Session extends BaseTest
{
	
	@Test
	public void doLogin(ITestContext context) throws Exception
	{
		System.out.println("doLogin");
		i=100;
		System.out.println(i);
		context.setAttribute("i_val", i);
		app.openBrowser("chromebrowser");
		
	}
	
	@Test
	public void doLogout() throws Exception
	{
		System.out.println("doLogout");
		
	}

}
