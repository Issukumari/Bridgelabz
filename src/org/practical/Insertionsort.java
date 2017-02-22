package org.practical;
import java.util.Scanner;
public class Insertionsort {
	
	public static String[] insertionsort(String[] a)
 	{
 	for(int i=1;i<a.length;i++)
 	{
 		for(int j=i;j>0;j--)
 		{
 			if(a[j].compareToIgnoreCase(a[j-1])<0)
 			{
 				String t=a[j];
 				a[j]=a[j-1];
 				a[j-1]=t;
			}
 			
 		}
 	}
 	return a;
 	}
	 public static void main(String[] args)
     {
  	   Scanner scn=new Scanner(System.in);
 		System.out.println("enter no of element");
 	int n=scn.nextInt();
 	  System.out.println("enter  string you want to enter");
      String[]    st = new String[n]; 
           for(int i=0;i<n;i++){
          	st[i]=scn.next();
           }
          	String []se=insertionsort( st);
          	System.out.println("elements is inserted as follows:");
          	for(int i=0;i<n;i++)
          	{
          	
           System.out.println(st[i]);
           }
          	}
	 }
 	
	
	
	
	
	
	
	
	
	
	
	
	
