package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyTestNGListener implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		System.out.println("****************** Test Failed " + result.getName());
		System.out.println(result.getThrowable().getMessage());
		ExtentTest test = (ExtentTest)result.getTestContext().getAttribute("test");
		test.log(Status.FAIL, result.getThrowable().getMessage());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("***************** Test Passed " + result.getName());
		System.out.println(result.getThrowable().getMessage());
		ExtentTest test = (ExtentTest)result.getTestContext().getAttribute("test");
		test.log(Status.PASS, result.getThrowable().getMessage());
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("***************** Test Skipped " + result.getName());
		System.out.println(result.getThrowable().getMessage());
		ExtentTest test = (ExtentTest)result.getTestContext().getAttribute("test");
		test.log(Status.SKIP, result.getThrowable().getMessage());
	}
	
}
