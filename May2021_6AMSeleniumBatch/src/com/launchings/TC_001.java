package com.launchings;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("amazonurl");
		
		windowMaximize();
		
		String title = windowTitle();
		System.out.println(title);
		
		String url = windowCurrentUrl();
		System.out.println(url);
		
		deleteCookies();
		
		windowBack();
		
		waitForElement(5000);
		
		windowForward();
		
		waitForElement(7000);
		
		windowRefresh();
		
		windowClose();
			
	}

}
