package org.practical;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		
		int n,array[],searchkey,first,last,middle;
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter no of element");
		    n=scn.nextInt();
	       
		    System.out.println("enter  element you want to enter");
             array = new int[n]; 
             for(int i=0;i<n;i++)
            	 array[i]=scn.nextInt(); 
             
             System.out.println("enter the element to be searched");
             searchkey=scn.nextInt();
             first=0;
             last=n-1;
             middle=(first+last)/2;
             
             while(first<=last)
             {
            	if( array[middle]<searchkey)
            	first=middle+1;
            	else if( array[middle] == searchkey ) 
            	{
            		System.out.println(searchkey +" found at index "+ middle);
          System.out.println(searchkey + " found at position " + (middle + 1));
                  break;
            	 }
            	  else
            	  {
            		  last=middle-1;
            	  }
            	  middle=(first+last)/2;
              } 
         
              if(first>last)
              {
        		  System.out.println(searchkey + " not found");

              }
           }
        
             }
