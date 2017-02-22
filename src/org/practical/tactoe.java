package org.practical;

import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class tactoe 
{

	public static void main(String[] args) {
		
		
		int row;
		int col;
		int count=0;
		//System.out.println("enter  matrix");
		Scanner scn =new Scanner(System.in);
		
		 //int m= scn.nextInt();
		//  int n= scn.nextInt();
			int a[][]=new int[3][3];
			char ch[][] =new char[3][3];
			
			//System.out.println("enter the element for matrix");
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					ch[i][j]='.';
				}
			}
			for(int i=0;i<=5;i++)
			{
			while(count==0)
			{
				
				Random  r=new Random();
				row= r.nextInt(3);
				col=r.nextInt(3);
				if(a[row][col]==0)
				{
					count++;
					a[row][col]=1;
					ch[row][col]='0';
				}
				
			}
			
			for(int k=0;k<3;k++)
			{
				for(int j=0;j<3;j++)
				{
			System.out.print(ch[k][j]+ "  ");
				}
			System.out.println();
			}
			//int p = 0;
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
					
				}
			}
		}	
			
	}}                                                                                                 
