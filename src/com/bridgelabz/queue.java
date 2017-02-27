package com.bridgelabz;

public class queue {
	 	private int front;
	 	private int rear;
	 	private int count;
		private Object[]queueArray;
		private int[] balanceArray;
		private int maxSize;
		
		     queue(int size)
		     {
			 maxSize=size;
			 queueArray=new Object[maxSize];
			 balanceArray=new int[maxSize];
			  front=-1;
			  rear=-1;
			   count=0;
		     }
		     public void enqueue(Object n)
		     {
		    	 if(rear==-1)
		    	 {
		    		 front=0;
		    		 rear=0;
		    		 queueArray[rear]=n;
		    		 
		    		 count++;
		    		 
		    	 }
		    	 else
		    		 queueArray[++rear]=n;
		    		 
		    	 }
	          public Object dequeue()
	          {
	        	  if(front<=rear)
	        	  {
	        		  count--;
	        	  return queueArray[front++];
	        	  
	        	  }
	        	  else
	        	  {
	        		System.out.println("already empty");  
	        	  }
				return null;
	          
	          }
	          public int size()
	          {
	        	  return  count;
           
}
	          public boolean isEmpty()
	          {
	        	 return  rear==-1;
	          }
	          public boolean full()
	  	    {
	  	    	return rear==maxSize-1   ;
	  	    }
	          
	          
	          
	          
	          
	          
	          
	          
}
