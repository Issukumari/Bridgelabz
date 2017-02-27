package org.practical;

import java.util.Scanner;

public class Flip1 
{

	public static void main(String[] args) 
		{
			double head = 0.00;
			double tail = 0.00;
			
			Scanner scn=new Scanner(System.in);
			System.out.println("enter how many times you want to enter");
			int count=scn.nextInt();
			 
			for(int i=1;i<=count;i++)
			{
				double d=Math.random();
				if(d>0.5)
				{
					head++;
					System.out.println("heads");
				}
				else {
					tail ++;
					System.out.println("tails");
				}
			}
		
		 System.out.println("head is "+(head/count)*100+ " % ");
		 System.out.println("tail is "+(tail/count)*100+ " % ");
		 
		}
		
}


