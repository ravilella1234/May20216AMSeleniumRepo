package com.launchings;

import org.apache.log4j.Logger;

public class TC_003 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception 
	{
		init();
		log.info("loading the Properties files.....");
		
		launch("chromebrowser");
		log.info("Launching the Brrowser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazonsearchdrop_id", "Books");
		log.info("Selected the option Books By using the locator  :- " + orProp.getProperty("amazonsearchdrop_id"));
		
		typeText("amazonsearchtextbox_name", "Harry Potter");
		log.info("Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Search Button By using the locator :- " + orProp.getProperty("amazonsearchbutton_xpath"));
		
		
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
