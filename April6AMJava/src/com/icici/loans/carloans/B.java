package com.icici.loans.carloans;

public class B extends A // ISA Relationship
{
	public void m1()
	{
		System.out.println("iam overriden m1 in class B");
	}
	
	public void m2()
	{
		System.out.println("iam m2 in class B");
	}

	public static void main(String[] args) 
	{
		A a  = new A(); //HasA Relationship
		a.m1();
		
		//B b =  new B();
		//b.m2();
		//b.m1();
		
		A obj = new B();
		obj.m1();
		
		//B obj1 = new A();
	}

}
