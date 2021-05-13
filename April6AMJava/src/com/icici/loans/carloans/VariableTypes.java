package com.icici.loans.carloans;

public class VariableTypes 
{
	//Primitive Variable
	int x = 100; //instance (or) instance-global (or) non-static variables
	static String cname = "vmware"; // static (or) static-global variable
	
	static VariableTypes obj ;
	
	public void m1()
	{
		int x=200; // local variable
		//System.out.println(y);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	
	public static void m2()
	{
		obj = new VariableTypes();
		System.out.println(obj.x);
		System.out.println(cname);
	}

	public static void main(String[] args) 
	{
		obj = new VariableTypes(); // reference Variable
		System.out.println(obj.x);
		System.out.println(VariableTypes.cname);	
	}

}
