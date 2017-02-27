package com.bridgelabz;

import java.util.Scanner;

public class linklistmainclass {

	public static void main(String[] args)
	{
Scanner scn=new Scanner (System.in);
		
		linklist f=new linklist();
		
		Unorderedlist l=new Unorderedlist();
		l.add("camel");
		l.add("dog");
		l.add("lion");
		l.add("cat");
		l.add("deer");
		String[] st=f.getfile();
		  
		
		int k=0;
		while(k<st.length)
		{
			
			System.out.println("element added to the list ");	
			
			l.disp();
			System.out.println("enter word to search");
			String word=scn.next();
			
			
	  boolean t= l.search(word);
	  if(t)
		{
			System.out.println(word+" Foud at the index:"+l.i);
			String t1=l.Delete(word );
			System.out.println(t1+" deleted");
			l.disp();
		}
	  else
		{
			System.out.println(word+" Not Found and added into List");
			l.add(word);
			l.disp();
			
		}
	  System.out.println("\nEnter the word to insert");
		String add=scn.next();
		l.add("");
		System.out.println("Enter the position");
		int pos=scn.nextInt();
		System.out.println(l.size());
		
		boolean in=l.addAtIndex(add, pos);
		if(in)
			System.out.println("Inserted   at position "+pos);
		
		l.disp();
		String update=l.st;
		if(f.addToFile(update))
		{
			System.out.println("\nFile has been Updated");
		}
		
		int s=l.size();
		System.out.println("Size="+s);
		
		
			
								
		}
		}}