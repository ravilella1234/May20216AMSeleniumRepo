package com.icici.loans.homeloans;

public class EmployeeChild extends Employee
{
	String city;
	
	public EmployeeChild(String city) {
		super(1000,"kiran",23.34f);
		this.city = city;
		System.out.println(this.city);
	}
	
	 

	public static void main(String[] args) 
	{
		EmployeeChild ec = new EmployeeChild("Hyderabad");
	}

}
