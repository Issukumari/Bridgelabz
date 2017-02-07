package org.practical;
import java .util.Scanner;
public class Leap {

	public static void main(String[] args) {
		 int yr;
	       Scanner scan = new Scanner(System.in);
		   
	       System.out.print("Enter Year : ");
	       yr = scan.nextInt();
		   
	       if((yr%4 == 0) && (yr%100!=0)||(yr%400 == 0))
	       {
	           System.out.print("This is a Leap Year");
	       }
	       else
	       
	           System.out.print("This is not a Leap Year");
	
	    }
	}

