package com.bridgelabz;



import java.util.Scanner;

//package org.practical;

import java.util.Scanner;

public class Binaryword 
{
	String searchkey=null;
	public  static void binarySearch(String[] st, String searchkey)
	 {
          int  first,last,middle;
		
		
             first=0;
             last=st.length-1;
             middle=(first+last)/2;
             
             while(first<=last)
             {
            	if( st[middle].compareToIgnoreCase(searchkey)<0){
            	first=middle+1;
            	}
            	else if( st[middle].compareToIgnoreCase(searchkey)==0) 
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
	                        System.out.println("enter the element to be searched");
	                     String searchkey=scn.next();
	            	    binarySearch(st,searchkey);
	            		
	            		
	            			 }
	               
	               }
