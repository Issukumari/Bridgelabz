package com.bridgelabz;

public class utility {

	
		public static void binarysearch(int[] arr,int searchkey)
		{
			int n=arr.length;
		
			int first=0;
			int last=n-1;
			int middle=(first+last)/2;
			
			while(first<=last)
			{
				if(arr[middle]<searchkey)
				{
	           first=middle+1;
				}
	           else if(arr[middle]==searchkey)
					{
					System.out.println(searchkey+"found at index:"+middle);
				  System.out.println(searchkey + " found at position " + (middle + 1));
		                  break;
					
					}
	           else
	           {
	        	   last=middle-1;
	           }
	           middle=(first+last)/2;
				}
			
		if(first>last)
		{
			System.out.println("search not found"+searchkey);
		}
		}
		   public int[] bubblesort(int[] arr)
		     {
			   
		     for(int i=0;i<arr.length;i++)
		     {
		    	 for(int j=1;j<arr.length-1;j++)
		    	 {
		    		if(arr[j-1]>arr[j]) 
		    		{
		    			int temp=arr[j-1];
		    			arr[j-1]=arr[j];
		    			arr[j]=temp;
		    		}
		    	 }
		    	}
		     return arr;
		     }
		   public int[] insertionsort(int[] arr)
		   {
			   for(int i=0;i<arr.length;i++)
			     {
			    	 for(int j=i;j>0;j--)
			    	 {
		       if(arr[j]<arr[j-1])
		       {
		    	   int temp=arr[j];
		    	   arr[j]=arr[j-1];
		    	   arr[j-1]=temp;
		    	   
		       }
			    }
			   }
			   return arr;
		   }
		   public void Integerdisp(int[] a)
		 	{
		 		 for(int i=0;i<a.length;i++)
				 {
					 System.out.print(a[i]+" ");
				 }
		 		
		 	}
		   public void Stringdisp(String[] a)
		 	{
		 		 for(int i=0;i<a.length;i++)
				 {
					 System.out.println(a[i]+" ");
				 }
		 		
		 	}
			public void Stringbinarysearch(String[] st,String searchkey)
			{

				int first=0;
				int last=st.length;
				int middle=(first+last)/2;
			
				
				while(first<last)
				{
					if(st[middle].compareToIgnoreCase(searchkey)<0)
					{
		             first=middle+1;
					}
					else if( st[middle].compareTo(searchkey)==0)
	            	{
	            		System.out.println(searchkey +" found at index "+ middle);
	          System.out.println(searchkey + " found at position " + (middle + 1));
	                  return;
	            	 }
		           else
		           {
		        		
		        	   last=middle-1;
		           }
		           middle=(first+last)/2;
					}
				
			if(first>last)
			{
				System.out.println("search not found"+searchkey);
			}
			}
			
              public static String[] Stringinsertionsort(String[] st)
              {
            	  for(int i=0;i<st.length;i++)
            	  {
            		  for(int j=i;j>0;j--)
            		  {
            			  if(st[j].compareToIgnoreCase(st[j-1])<0)
            			  {
            				  String temp=st[j];
            				  
                                st[j]=st[j-1];
                                st[j-1]=temp;
                                
                                
            			  }
            		  }
            	  }
            	  return st;
              }
		   
                
public static String[] Stringbubblesort(String[] st)
{
	  for(int i=0;i<st.length;i++)
	     {
	    	 for(int j=1;j<st.length-1;j++)
	    	 {
   		if(st[j-1].compareToIgnoreCase(st[j])>0) 
   		{
   			String temp=st[j-1];
   			st[j-1]=st[j];
   			st[j]=temp;
		  		
		  		}
	    		 
			  }
            }
           return st;

            }
		


	}


