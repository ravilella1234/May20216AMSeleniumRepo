package parallelsuites;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args)
	{
		/*
		 * String[] s1 = {"ravi","lella"};
		 * 
		 * String[] s2 = new String[5]; s2[0]="ravi"; s2[1]="lella";
		 * 
		 * String[] s3 = new String[] {"ravi","lella"};
		 */
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
