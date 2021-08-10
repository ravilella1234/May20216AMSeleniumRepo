package com.reports;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager1 
{
	
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	
	
	public static ExtentReports getReports()
	{
		Date dt = new Date();
		String htmlFileName = dt.toString().replace(':', '_').replace(' ', '_');
		
		if(htmlReport == null)
		{
			htmlReport = new ExtentHtmlReporter("D:\\AprilWorkSpace\\AutomationProject\\reports\\"+htmlFileName+".html");
			htmlReport.config().setDocumentTitle("Automation Report");
			htmlReport.config().setReportName("Funtional testing report");
			htmlReport.config().setTheme(Theme.STANDARD);
			
			
			report= new ExtentReports();
			report.attachReporter(htmlReport);
			report.setSystemInfo("OS", "Windows");
			report.setSystemInfo("Tester Name", "Ravikanth Lella");
			report.setSystemInfo("Browser", "Chrome");
			
		}
		return report;
		
	}

}
