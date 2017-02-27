package org.practical;

import java.util.Scanner;

public class anagram {
	public static void main(String[] args) 
	{
	Scanner scn =new Scanner(System.in);
	ana an=new ana();
	System.out.println("enter first string");
	 String st1= scn.nextLine();
	 System.out.println("enter second string");
	String st2= scn.nextLine();
	
	boolean rs = an.isAnagram(st1,st2);
	if (rs){
	System.out.println("string is anagram");}
	else{
		System.out.println("string not anagram");
	}}}
          
	
	class ana
	{
	
	 boolean isAnagram(String st1, String st2)
	{
		st1= removeSpace1(st1);
		st2= removeSpace1(st2);
		
		if(st1.length()!=st2.length())
		
          return false;	
	 
			
			
			st1= toLower(st1);
			st2= toLower(st2);
			boolean b=check(st1,st2);
			return b;
		}
	
	
		 String removeSpace1(String st)
		{
			char ch[]=st.toCharArray();
			st="";
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]!= ' ')
					st=st+ch[i];
			}
			return st;
				
			}
	
	
	 String toLower(String st)
	{
		char ch[]=st.toCharArray();
		st="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65 & ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+32);
			}}
	
	 st=new String(ch);
		return st;
	}
     boolean check(String st1, String st2)
    {
    	char c1[]=st1.toCharArray();
    	char c2[]=st2.toCharArray();
    	c1=sort(c1);
    	c2=sort(c2);
	for(int i=0;i<c1.length;i++)
	{
		if(c1[i]!=c2[i])
			return false;
	}
	        return true;
	}
        
	 
	 char[] sort(char [] ch)
	 {
		 for(int i=0;i<ch.length;i++)
		 {
			 for(int j=i+1;i<ch.length;j++)
			 {
				 if(ch[i]>ch[j])
				 {
					 char t=ch[i];
					 ch[i]=ch[j];
                      ch[j]= t;
				 }
			 
			 }
			 
		 }
		 return ch;
	 }
	
}
	
	 