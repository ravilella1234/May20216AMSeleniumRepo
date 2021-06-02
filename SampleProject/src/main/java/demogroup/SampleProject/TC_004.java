package demogroup.SampleProject;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_004");
		test.log(LogStatus.INFO, "loading the Properties files.....");
				
		launch("chromebrowser");
		test.log(LogStatus.PASS, "Launching the Brrowser : " + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProp.getProperty("amazonurl"));
				
		selectOption("amazonsearchdrop_id", "Books");
		test.log(LogStatus.FAIL, "Selected the option Books By using the locator  :- " + orProp.getProperty("amazonsearchdrop_id"));
		
		typeText("amazonsearchtextbox_name", "Harry Potter");
		test.log(LogStatus.PASS, "Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked on Search Button By using the locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
		report.endTest(test);
		report.flush();
		
		//WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		//loc.sendKeys("Books");
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
		
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//driver.findElement(By.linkText("Customer Service")).click();
		
		//driver.findElement(By.partialLinkText("Customer Serv")).click();
		
		/*
		 * List<WebElement> links = driver.findElements(By.tagName("a")); for(int
		 * i=0;i<links.size();i++) { if(!links.get(i).getText().isEmpty()) {
		 * System.out.println(links.get(i).getText()); }
		 * 
		 * }
		 */
		
	}
}
