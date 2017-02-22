package org.practical;
import java.util.Random;

import java.util.Scanner;
public class tic {
	

	//public static void main(String[] args) 
//	{
//	}
		public void Board()
	{
	
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
	            char a[][]=new char[3][3]; 
				a[i][j]='-';
			}
		}}
		
		public void Printboard()
		{
		
		
			System.out.println("...............");
			for(int i=0;i<3;i++)
			{
				System.out.println('.');
			
				for(int j=0;j<3;j++)
				{
					char a[][]=new char[3][3]; 
				a[i][j]= '.' ;
					
				}
			}
		}
			
				//public boolean checkForWin()
				//{
						
				//	if(checkRowsForWin() || checkColumnsForWin1() || checkDiagonalsForWin())
						
				//	{
				//		return true;
				//	}
				//	else
				//	{
				//		return false;
				//}
				//	}
				 boolean checkRowsForWin(char a1, char a2, char a3) 
					{
						for(int i=0;i<3;i++)
						{
							char a[][]=new char[3][3]; 
						
						if (checkRowsForWin(a[i][0], a[i][1], a[i][2]) == true)
						{
							return true;
						}
						return false;
					}
						
						return false;
				}
			 boolean checkColumnsForWin1( char a1, char a2, char a3)
					{
						for(int j=0;j<3;j++)
						{
						
							char a[][]=new char[3][3]; 
						if (checkColumnsForWin1(a[0][j], a[1][j], a[2][j]) == true)
						{
							return true;
							}
						return false;
						}
						return false;
					}
		       boolean checkDiagonalsForWin(char a1, char a2, char a3) 
						{
							for(int i=0;i<3;i++)
							{
							
						
							for(int j=0;j<3;j++)
							{
								char a[][]=new char[3][3]; 
							
								if (checkDiagonalsForWin(a[0][0], a[1][1], a[2][2]) == true) 
							{
								return true;
								}
							return false;
							}
		
							}
							return false;
						}
					}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
