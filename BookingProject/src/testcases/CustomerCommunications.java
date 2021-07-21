package testcases;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class CustomerCommunications 
{

	@Test
	public void checkEmail(ITestContext context)
	{
		System.out.println("Checking mail for Confirmation.....");
		String bookingID = (String)context.getAttribute("bookingID");
		System.out.println("Checking mail for confirmation : " + bookingID);
	}
}
