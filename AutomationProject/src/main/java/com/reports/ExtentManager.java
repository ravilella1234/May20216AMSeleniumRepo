package com.reports;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager 
{
	public static ExtentReports reports;
	public static String screenshotFolderPath;
	
	public static ExtentReports getReports()
	{
		if(reports == null)
		{
			reports = new ExtentReports();
			//init th ereport folder
			Date d = new Date();
			String reportsFolder = d.toString().replaceAll(":", "_")+"//screenshots";
			screenshotFolderPath = System.getProperty("user.dir")+"//reports//"+reportsFolder;
					
			File f = new File(screenshotFolderPath);
			f.mkdir();
			
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(screenshotFolderPath);
			sparkReporter.config().setReportName("Production Regression Testing...");
			sparkReporter.config().setDocumentTitle("Automation Reports");
			sparkReporter.config().setTheme(Theme.STANDARD);
			
			reports.attachReporter(sparkReporter);
		}
		return reports;
	}
	
	

}
