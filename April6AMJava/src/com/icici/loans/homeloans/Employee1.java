package com.icici.loans.homeloans;

public class Employee1 
{
	private int eno;
	private String ename;
	
	public Employee1(int eno, String ename) 
	{
		super();
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public void display()
	{
		System.out.println("EMP ID : " + getEno() + "  EMP NAME : " + getEname());
	}

	

}
