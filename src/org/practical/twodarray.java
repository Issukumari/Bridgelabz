package org.practical;

import java.util.Scanner;

public class twodarray {
	public static void main(String[] args) 
	{
		
	System.out.println("enter  matrix");
	Scanner scn =new Scanner(System.in);
	
	
	 int m= scn.nextInt();
	  int n= scn.nextInt();
	 
	  
		int a[][]=new int[m][n];
		System.out.println("enter the element for matrix");
		for(int i=0;i<m;i++)
		for(int j=0;j<n;j++)
			a[i][j]=scn.nextInt();
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
		System.out.print(a[i][j]+ " ");
			}
		System.out.println();
		}
			
		}
		
		
	  

}
