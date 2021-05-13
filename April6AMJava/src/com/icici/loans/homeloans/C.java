package com.icici.loans.homeloans;

import com.icici.loans.carloans.A;

public class C extends A
{
	public void m1()
	{
		System.out.println("iam overriden m1 in class C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 in class C");
	}
	
	public static void main(String[] args) 
	{
		C c = new C();
		c.m1();
		c.m3();
	}

}
