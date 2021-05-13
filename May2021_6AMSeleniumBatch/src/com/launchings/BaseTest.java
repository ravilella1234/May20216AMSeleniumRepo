package com.launchings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static Properties p;
	
	public static void init() throws Exception
	{
		FileInputStream fis = new FileInputStream(projectPath +"//data.properties");
		p = new Properties();
		p.load(fis);
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\May 20201 Drivers\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "C:/Users/DELL/Desktop/May 20201 Drivers/geckodriver.exe");
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
	}
	
	public static void navigateUrl(String url)
	{
		driver.get(p.getProperty(url));
	}

}
