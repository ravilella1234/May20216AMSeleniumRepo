package com.icici.loans.personalloans;

import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
				
		int nr,dr,result;
		
		Scanner sc =  new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the Nr Value : ");
			nr = sc.nextInt();
			System.out.println("Enter the Dr Value : ");
			dr = sc.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (Exception e)
			{
				//e.printStackTrace();
				System.out.println("Dr value should be greater than zero...");
			} 
			finally 
			{
				System.out.println("Iam final Block....");
			}
		}
	}

}
