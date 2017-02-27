package com.bridgelabz;
import java.util.Random;
import java.util.Scanner;

public class tactoe 
{
	static int row;
	static  int col;
	//static int count=0;
	static int a[][]=new int[3][3];
	
	static char ch[][] =new char[3][3];
	public static void main(String[] args)
	{
			
		
		Scanner scn =new Scanner(System.in);
			
			
			for(int i=0;i<ch.length;i++)
			{
				for(int j=0;j<ch[i].length;j++)
				{
					ch[i][j]='.';
				}
			}
			
			
			
			System.out.println(Startgame());
			System.out.println();
	}
	private static String Startgame()
	{
		Scanner scn=new Scanner(System.in);
		
		
		Random  r=new Random();
			for(int i=0;i<=5;i++)
			{
				int count=0;
			while(count==0)
			{
				
				
				row= r.nextInt(3);
				col=r.nextInt(3);
				if(a[row][col]==0)
				{
					count++;
					a[row][col]=1;
					ch[row][col]='0';
				}
			  if(ch[0][0]=='0'&&ch[0][1]=='0'&&ch[0][2]=='0'||
				 ch[1][0]=='0'&&ch[1][1]=='0'&&ch[1][2]=='0'||
				ch[2][0]=='0'&&ch[2][1]=='0'&&ch[2][2]=='0'||
				ch[0][0]=='0'&&ch[1][0]=='0'&&ch[2][0]=='0'||
				ch[0][1]=='0'&&ch[1][1]=='0'&&ch[2][1]=='0'||
				ch[0][2]=='0'&&ch[1][2]=='0'&&ch[2][2]=='0'||
			    ch[0][0]=='0'&&ch[1][1]=='0'&&ch[2][2]=='0'||
	        	ch[2][0]=='0'&&ch[1][1]=='0'&&ch[0][2]=='0')
				{
					return "computer won";
				}

			}
			
			for(int i1=0;i1<3;i1++)
			{
				for(int j=0;j<3;j++)
				{
			System.out.print(ch[i1][j]+"  ");
				}
			System.out.println();
			}
			
		if(i<4)
		{
			count=0;
		while(count==0)
				{
			System.out.println("enter row");
				row= scn.nextInt();
				System.out.println("enter col");
					col=scn.nextInt();
					
					if(a[row][col]==0)
					{
						count++;
						a[row][col]=2;
						ch[row][col]='x';
					}
					else
						System.out.println("already exist");
				}
			 
			}
		if(ch[0][0]=='X'&&ch[0][1]=='X'&&ch[0][2]=='X'||
		   ch[1][0]=='X'&&ch[1][1]=='X'&&ch[1][2]=='X'||
		   ch[2][0]=='X'&&ch[2][1]=='X'&&ch[2][2]=='X'||
		   ch[0][0]=='X'&&ch[1][0]=='X'&&ch[2][0]=='X'||
		   ch[0][1]=='X'&&ch[1][1]=='X'&&ch[2][1]=='X'||
	       ch[0][2]=='X'&&ch[1][2]=='X'&&ch[2][2]=='X'||
		    ch[0][0]=='X'&&ch[1][1]=='X'&&ch[2][2]=='X'||
			ch[2][0]=='X'&&ch[1][1]=='X'&&ch[0][2]=='X')
		{
		return "Player 2 won";
		}
	}
	return "Match draw";
	}

				
			
		
	}                                                                                              

	


