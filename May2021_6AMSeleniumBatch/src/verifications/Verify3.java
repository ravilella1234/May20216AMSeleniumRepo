package verifications;

import com.launchings.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

public class Verify3 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		init();
		test = report.startTest("Verify3");
		test.log(LogStatus.INFO, "loading the Properties files.....");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Launching the Brrowser : " + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProp.getProperty("amazonurl"));
		
		String expectedLink = "Customer Servic";
		
		if(!verifyLinksEqual(expectedLink))
			reportFailure("Both Links are not equal...");
			//System.out.println("Both Links are not equal...");
		else
			reportSuccess("Both Links are equal...");
			//System.out.println("Both Links are equal...");
		
		report.endTest(test);
		report.flush();

	}	
}
