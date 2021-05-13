package com.icici.loans.homeloans;

public class TwoDimenssionArray 
{

	public static void main(String[] args) 
	{
		int[][] a= {
				      {10,20,30,40},
				      {40,50},
				      {70,80,90,100,110}
				   };
		
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +"  ");
			}
			System.out.println();
		}
		
		for(int k[]:a)
		{
			for(int i:k)
			{
				System.out.print(i  +"  ");
			}
			System.out.println();
		}
	}

}
