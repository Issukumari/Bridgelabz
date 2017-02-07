package org.practical;

import java.util.Scanner;

		
          public class Prime{
        	  
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		   
	       System.out.print("Enter number");
	   int n = scn.nextInt();
	      for( int i=2;i<=n/2;i++)
	      {
	    	  if(n%i==0)
	    	  {
	    	 
	    		  if(isPrime(i))
	    		  {
	    			  System.out.println(i+ " ");
	    		  }
	    	  }
	    	  }
	}
          
          
          

	    		static boolean isPrime(int n)
	    		{
	    			 int i=2;
	    	          while(i<=n/2){
	    	        	  if(n%i==0)
	    	        	  {
	    	        		  
	    	        		return false;
	    	        		 
	    	        	  }
	    	        	  i++;
	    	    
	    	          }
	    	    		
  	        		return true;
	    		}
          }
          
	    		
	    		


