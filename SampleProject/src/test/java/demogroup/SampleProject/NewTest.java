package demogroup.SampleProject;

import org.testng.annotations.Test;

public class NewTest 
{
	
  @Test
  public void test1() 
  {
	  System.out.println("Iam Test1 Method : " + Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("Iam Test2 Method :  " + Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("Iam Test3 Method :  " + Thread.currentThread().getId());
  }
}
