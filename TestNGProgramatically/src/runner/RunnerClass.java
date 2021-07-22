package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class RunnerClass 
{

	public static void main(String[] args) 
	{
		TestNG testNg = new TestNG();
		
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("My Suite");
		List<XmlSuite> allSuites = new ArrayList<XmlSuite>();
		allSuites.add(mySuite);
		testNg.setXmlSuites(allSuites);
		
		XmlTest test = new XmlTest(mySuite);
		test.setName("Login Test");
		
		List<XmlClass> classes = new ArrayList<XmlClass>();
		classes.add(new XmlClass("testcases.Login"));
		
		test.setXmlClasses(classes);
		
		testNg.run();

	}

}
