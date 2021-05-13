package com.icici.loans.homeloans;

import java.util.Scanner;

public class SingleDimenssionArray 
{
	
	public int m1()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int aSize = sc.nextInt();
		
		int[] a = new int[aSize];
		int sum=0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = a[i]+sum;
		}
		System.out.println("Sum of the array is : " + sum);
		return sum;
	}

	public static void main(String[] args) 
	{
		/*
		 * int[] a = {10,20,30,40}; for(int i=0; i<a.length; i++) {
		 * System.out.println("a["+i+"]="+ a[i]); }
		 */
		SingleDimenssionArray obj  = new SingleDimenssionArray();
		int count = obj.m1();
		System.out.println("Count of array is : " + count);
		
	}

}
