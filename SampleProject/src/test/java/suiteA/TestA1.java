package suiteA;

import org.testng.annotations.Test;

public class TestA1 
{
  @Test
  public void testA1() throws Exception 
  {
	  System.out.println("Strating TestA1");
	  
	  Thread.sleep(3000);
	  
	  System.out.println("Ending TestA1");
  }
}
