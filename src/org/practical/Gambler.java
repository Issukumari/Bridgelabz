package org.practical;
import java.util.Scanner;

public class Gambler {
	
	static double win=0;
	static double loss=0;
	static double trail;
	static double stack;
	static double goal;
	public static void main(String[] args) 
	{
	
		System.out.println("enter stack value you want");
		Scanner scn =new Scanner(System.in);
		  stack= scn.nextInt();
		
		
		System.out.println("enter  goal you want");
			 goal=scn.nextInt();
		
		System.out.println("enter trail value you want");
	 trail =scn.nextInt();
		  
		if (trail>0 && stack>0 &&stack <=goal)
		{
			play(trail);
		}
		}
		
		static void play(double n)
		{
		for (int i=1;i<=n;i++)
		{
	    double d=Math.random();
		if(d<0.5)
		{
		loss++;
		stack--;
		}
		else
		{
		win++;
		stack++;
		}
	}
	
	
	System.out.println("percentage of game win"+(win/trail)*100+ "%");
    System.out.println("percentage of game loss "+(loss/trail)*100+ "%");
	}
	}


