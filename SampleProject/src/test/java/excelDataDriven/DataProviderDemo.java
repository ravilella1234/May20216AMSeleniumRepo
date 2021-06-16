package excelDataDriven;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo 
{
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, String s1) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() 
  {
	  
    return new Object[][] 
    {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
    
  }
}
