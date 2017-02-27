package com.bridgelabz;

import java.util.Scanner;

public class queuemainclass {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		
		queue q1=new queue(5);
		Bankcash b1=new Bankcash();
		System.out.println("welcome to garib manager bank name gautam");
		System.out.println("dont keep exceptation much more money in garib bank ");
		
		Bankcash b2=new Bankcash();
		
		
		Bankcash b3=new Bankcash();
		q1.enqueue(b1);
		q1.enqueue(b2);
		q1.enqueue(b3);
		Bankcash obj=(Bankcash)q1.dequeue();
		System.out.println("enter the amt u want to deposit  ");
		int x=scn.nextInt();
		obj.deposit(x);
		System.out.println("enter the amt u want to withdraw  ");
		int y=scn.nextInt();
		obj.withdraw(y);
		//obj=(Bankcash)q1.dequeue();
		//obj.deposit(10070);
	//	obj.withdraw(4000);
		
		
		
		
		
		
		 // while(true)
		//  {
			// System.out.println("enter 1 for withdraw\n enter 2 for deposit");
			 //for(int i =0;i<5;i++)
			 //{
				
			//	 System.out.println("what you want");
			//	 int symbol=scn.nextInt();
			//	 System.out.println("enter your amt");
			//	 int cash=scn.nextInt();
				 
				 
			 
			// if(symbol==1)
			// {
		// q1.enqueue(cash);
				
			//	}
		//	 else
		//	 {
		//		 int x=b1.deposit( cash);
				
		//	 }
			 
			 
		//	 }
		//	 System.out.println("do u want to continue press yfor yes or prees n for no");
		 //     char st=scn.next().charAt(0);
		   
		 //     if(st=='n')
		 //     {
		  //    break;
		    	  
		   //   }
		               
		 // }
		
		
	}

}
