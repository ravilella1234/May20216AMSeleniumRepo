package com.icici.loans.homeloans;

public class Employee1Child extends Employee1
{

	public static void main(String[] args) 
	{
		Employee1Child ec = new Employee1Child();
		//System.out.println(ec.eno);
		//System.out.println(ec.ename);
		
		ec.setEno(1744);
		ec.setEname("ravilella");
		
		System.out.println(ec.getEno());
		System.out.println(ec.getEname());

	}

}
