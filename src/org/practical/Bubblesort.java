package org.practical;
import java.util.Scanner;
public class Bubblesort {
	public static int[] bubblesort(int[] arr)
 	{
		int n=arr.length;
		int temp=0;
 	
 	for(int i=0;i<n;i++)
 	{
 		for(int j=1;j<(n-i);j++)
 		{
 			if(arr[j-1]>arr[j])
 			{
 			temp=arr[j-1];
 			arr[j-1]=arr[j];
 			arr[j]=temp;
			}
 			
 		}
 	}
 	return arr;

}
	public static void main(String[]args)
	{
		   Scanner scn=new Scanner(System.in);
      		System.out.println("enter no of element");
      	int n=scn.nextInt();
      	       
		
		System.out.println("Enter the elements");
		int a[]=new int[n];
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=scn.nextInt();}
		      bubblesort( a);

	           System.out.println("elements is sorted as follows:");
	          	for(int j=0;j<n;j++)
	          	{
	          	System.out.println(a[j]);
	           }
		 }
		
	
	}