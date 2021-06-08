package demogroup.SampleProject;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class TNG_001 extends BaseTest
{
	
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  System.out.println("beforeMethod");
	  
	    init();
		test = report.startTest("TNG_001");
		test.log(LogStatus.INFO, "loading the Properties files.....");
				
		launch(bType);
		test.log(LogStatus.PASS, "Launching the Brrowser : " + bType);
				
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon() 
  {
	  System.out.println("f Test");
	  
	    selectOption("amazonsearchdrop_id", "Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using the locator  :- " + orProp.getProperty("amazonsearchdrop_id"));
		
		typeText("amazonsearchtextbox_name", "Harry Potter");
		test.log(LogStatus.PASS, "Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Search Button By using the locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("afterMethod");
	  
	    report.endTest(test);
		report.flush();
		
		driver.quit();
  }

}
