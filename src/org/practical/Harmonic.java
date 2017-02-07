package org.practical;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		float sum=0.00f;
		Scanner scn= new Scanner(System.in);
		   
	       System.out.print("Enter number : ");
	       float n = scn.nextFloat();
	       for (float i=1;i<=n;i++){
	    	  sum=sum+(1/i); 
	       }
	    	   System.out.println(sum);
	       }

	}


