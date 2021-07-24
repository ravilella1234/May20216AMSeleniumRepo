package runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
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
		
		//1st testCase
		XmlTest createBookingTest = new XmlTest(mySuite);
		createBookingTest.setName("Create Booking Test - Apply Discount - pay@hotel");
		
		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("action", "pay@hotel");
		createBookingTest.setParameters(parameters);
		
		List<XmlClass> testClasses = new ArrayList<XmlClass>();
		
		XmlClass testClass = new XmlClass("testcases.BookingSearch");
		List<XmlInclude> methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("searchHotel",1));
		methods.add(new XmlInclude("selectHotel",2));
		methods.add(new XmlInclude("enterGuestInfo",3));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass = new XmlClass("testcases.PaymentManager");
		methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("applyDiscount",1));
		methods.add(new XmlInclude("makePayment",2));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		testClass = new XmlClass("testcases.CustomerCommunications");
		methods = new ArrayList<XmlInclude>();
		methods.add(new XmlInclude("checkEmail",1));
		testClass.setIncludedMethods(methods);
		testClasses.add(testClass);
		
		createBookingTest.setXmlClasses(testClasses);
		
		
		//2nd testCase
		XmlTest cBND = new XmlTest(mySuite);
		cBND.setName("Create Booking Test - No Discount - pay@hotel");
		
		Map<String, String> parameterscBND = new HashMap<String, String>();
		parameterscBND.put("action", "pay@hotel");
		cBND.setParameters(parameterscBND);

		List<XmlClass> testClassescBND = new ArrayList<XmlClass>();
		
		XmlClass testClasscBND = new XmlClass("testcases.BookingSearch");
		List<XmlInclude> methodscBND = new ArrayList<XmlInclude>();
		methodscBND.add(new XmlInclude("searchHotel",1));
		methodscBND.add(new XmlInclude("selectHotel",2));
		methodscBND.add(new XmlInclude("enterGuestInfo",3));
		testClasscBND.setIncludedMethods(methodscBND);
		testClassescBND.add(testClasscBND);
		
		testClasscBND = new XmlClass("testcases.PaymentManager");
		methodscBND = new ArrayList<XmlInclude>();
		methodscBND.add(new XmlInclude("makePayment",1));
		testClasscBND.setIncludedMethods(methodscBND);
		testClassescBND.add(testClasscBND);
		
		testClasscBND = new XmlClass("testcases.CustomerCommunications");
		methodscBND = new ArrayList<XmlInclude>();
		methodscBND.add(new XmlInclude("checkEmail",1));
		testClasscBND.setIncludedMethods(methodscBND);
		testClassescBND.add(testClasscBND);
		
		cBND.setXmlClasses(testClassescBND);
		
		testNg.run();
		
	}

}
