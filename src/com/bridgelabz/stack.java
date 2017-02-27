package com.bridgelabz;

import java.util.Stack;

public class stack {

	int top;
	private char[]stackArray;
	private int maxSize;
	
	stack(int size)
	{
		maxSize=size;
		stackArray=new char[maxSize];
		top=-1;
	}
	public void push(char ch)
	{
	
		 stackArray[++top]=ch;
	}
	
	public boolean pop()
	{
		if(top>=0)
		{
			--top;
		return true;
	  }
	else
		{
		
		System.out.println("stack underflow");
		
		return false;
		}
	}
	
	
	public int size()
	{
		return top+1;
	}
	public int peek()
	{
		return stackArray[top];
		
	}
	public boolean Empty()
	{
		return top==-1;
	}
	    public boolean full()
	    {
	    	return top==maxSize-1   ;
	    }
	}
