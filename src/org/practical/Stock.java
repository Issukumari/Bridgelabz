package org.practical;
import java.util.Scanner;
public class Stock {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter how many company you want to add");
		int n=scn.nextInt();
		String[] st=new String[n];
		 int[] a=new int[n];
		 double[] d=new double[n];
		 int count=0;
		 double sum =0.0;
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("enter  company name");
		    st[i]=scn.next();
			System.out.println("Enter no of stockes");
			a[i]=scn.nextInt();
	
			System.out.println("Enter stock value");
			d[i]=scn.nextDouble();
		 }
			
			System.out.println("Company details");
			for (int i=0;i<n;i++)
			{
		      System.out.println("company name:"+st[i]);
		      System.out.println("no of stock"+a[i]);
		      System.out.println("stock value"+d[i]);
		      System.out.println("total value of stock="+d[i]*a[i]);
		      count=count+a[i];
		      sum=sum+(d[i]*a[i]);
		       }
			
			   System.out.println("....");
			   System.out.println("Total no of stocks = " + count);
	  	   System.out.println(" Total Stock value = "+ sum);
	
	
	
	        }
               }











