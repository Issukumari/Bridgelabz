package org.practical;

import java.util.Scanner;

public class utilitymainclass 
{

	public static void main(String[] args)
	{
		utility u=new utility ();
		Scanner scn=new Scanner(System.in);
		System.out.println("press 1 for integer input\n press 2 for string input");
		int val=scn.nextInt();
		if(val==1)
		{
			System.out.println("Enter the number of elements");
			int n=scn.nextInt();
			System.out.println("Enter the elements");
		int  a[]=new int[n];
			 for(int i=0;i<a.length;i++)
			 {
				 a[i]=scn.nextInt();
			 }
		
		      System.out.println("Enter 1 for bubble sort\n Enter 2 for insertion sort\n Enter 3 for binary search");
		       int op=scn.nextInt();
		    		   if(op==1)
		    		   {
		    		
		    		      int[] b=u.bubblesort(a);
		    			  System.out.println("after bubble sort");
		    		      u.Integerdisp(b);
		    		     
		    		   }
		    		   else if(op==2)
		    		   {
	                    int[] s=u.insertionsort(a);
                       System.out.println("after insertion sort");
                       u.Integerdisp(s);
		    		   }
		    		   else if(op==3)
		    		   {
		    			   System.out.println("enter searchkey element");
		    			   int searchkey=scn.nextInt();
		    			   int[] c=u.bubblesort(a);
		    			   u.binarysearch(c,searchkey);
		    		   }
		}
		    		   
		 if(val==2)
		{
			System.out.println("Enter the number of elements");
			int  n=scn.nextInt();
			System.out.println("Enter the elements");
		String  st[]=new String[n];
			 for(int i=0;i<st.length;i++)
			 {
				 st[i]=scn.next();
			 }
		      
			  int t=1;
			     do
			     {
			    	 
			   System.out.println("enter 1 for bubblesort\n enter 2 for insertionsort\n enter 3 for binary search");
			   int op=scn.nextInt();
			    if( op==1)
			    {
			    	System.out.println();
			         String[] b=u.Stringbubblesort(st);
			    	System.out.println("after bubblesort");
			            u.Stringdisp(b);
		
			    }
	             if(op==2)
			    {
	            	 System.out.println("Enter the elements");
	 				String c[]=new String[n];
	 				 for(int i=0;i<c.length;i++)
	 				 {
	 					 c[i]=scn.next();
	 				 }
			    	String[] k=u.Stringinsertionsort(st);
			    	System.out.println("after insertionsort");
			    	u.Stringdisp(k);
			    			
			    }
			    if(op==3)
			    {
			    	 //System.out.println("Enter key elements");
					 //String key=scn.next();
					 
		jkhg	    System.out.println("enter searchkey element");
			    String Searchkey=scn.next();
			    String[] l=u.Stringbubblesort(st);
			    	u.Stringbinarysearch(l, Searchkey);
			    	System.out.println("to continue press 1");
					t=scn.nextInt();
	    		   }
	
	
	}while (t==1);
			    }
			    	
			     }
			 
			 
			 
		}

