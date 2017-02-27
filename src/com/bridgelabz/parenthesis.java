package com.bridgelabz;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis {

	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the String to check its Balanced or Not");
			String str=sc.nextLine();
			
			stack st=new stack(str.length());
			
	   char[] ch=str.toCharArray();
	   int i=0;
		for(int i1=0;i1<ch.length;i1++)
			{
				if(ch[i1]=='(')
				{
					st.push(ch[i1]);
			
				}
				else if(ch[i1]==')')
				{
					if(!st.pop())
						break;
				}
			}
			
			if(i==ch.length)
			{
				System.out.println("String is Balanced");
			}
			else
			{
				System.out.println("String is Not Balanced");
			}
		}

	

	

}
