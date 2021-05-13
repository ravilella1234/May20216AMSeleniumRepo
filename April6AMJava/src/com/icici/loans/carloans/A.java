package com.icici.loans.carloans;

import java.util.Date;

public   class A 
{
	 final static int x=100;
	
	public static strictfp void m1()
	{
		
		System.out.println("iam m1 in class A");
	}
	
	public static void m5()
	{
		System.out.println("iam m5 static");
	}
	
	static
	{
		System.out.println("Iam static block");
	}
	
	static 
	{
		Date dt = new Date();
		System.out.println(dt);
	}
	
	public  final static void m6()
	{
		
	}
	
	
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		A.m5();
	}

}
