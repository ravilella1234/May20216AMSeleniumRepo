package com.project.keywords;

public class ValidationKeywords extends GenericKeywords
{
	
	public void ValidateTitle()
	{
		log("Validate Title");
	}
	
	public void ValidateText()
	{
		
	}
	
	public void validateElementPresent(String locator)
	{
		// failure
		reportFailure("Element is not found : " + locator);
	}

}
