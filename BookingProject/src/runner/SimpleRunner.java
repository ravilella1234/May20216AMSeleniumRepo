package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class SimpleRunner 
{

	public static void main(String[] args) 
	{
		TestNG testNg = new TestNG();
		
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Booking Suite");
		List<XmlSuite> allSuites = new ArrayList<XmlSuite>();
		allSuites.add(mySuite);
		testNg.setXmlSuites(allSuites); // TestNG has List<XmlSuite>
		
		XmlTest createBookingTest = new XmlTest(mySuite);
		createBookingTest.setName("Create Booking Test - Apply Discount - pay@hotel");

	}

}
