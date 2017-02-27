package com.bridgelabz;

public class Unorderedlist {
	
	Node start=null;
	Node last=null;
		
			public class Node {
				String data;
				Node next;
			
				Node(String st)
				{
				data=st;
				next=null;
				}
			}  
			public boolean add(String st)
			{
				if(start==null)
				{
					
					Node t=start;
					start=new Node(st);;
					last=start;
					return true;
				}
				
				last.next=new Node(st);
				last=last.next;
				return true;
			}
		
		
		public boolean addAtIndex(String st,int pos)
		{
			Node p=start;
			Node ad=null;
			for (int i = 0; i <pos; i++) {
				ad=p;
				p=p.next;
			}
			ad.next=new Node(st);
			ad.next.next=p;
			return true;
		}
		String st;
		public void disp()
		{
			st="";
			Node p=start;
			while(p!=null)
			{
				System.out.print(p.data+"--->");
				st=st+p.data+",";
				p=p.next;
			}
			System.out.println();
			
		}	
             int i;
             public boolean search(String st)
             {
            	 Node t=start;
         		while(t!=null)
         		{
         			if(t.data.equalsIgnoreCase(st))
         			{
         				return true;
         			}
         			i++;
         			t=t.next;
         		}
         		return false;
            	// Node start=null;
            	 
            	// Node p=start;
            	// boolean  flag=false;
            	// while(p!=null)
          	  // {
            		 
            	// if(p.data.equalsIgnoreCase(st))
          		// {
            	//	 flag =true;
               		 //}
                       	
            	// p=p.next;
            	// i++;
           //  }
          // return flag;
            }
             
              /*     public boolean Delete(String st)
                   {
                	 // Node temp = null;
                	
                	//Node  p=start;
                	//Node ad=null;
                	//ad.next=p;
                	//p.next=temp;
                	//temp=ad;
                	//ad.next=null;
                	//for(int i=0;i<pos;i++)
                //	{
                	//	p=p.next;
                	  // }
					//return true;
                	
                	//ad=p.next;
            		
    				//temp=ad.next;
    				//p.next=temp;
    				//return true;
					Node head=null;
					//if(head ==null)
					//{
					//    System.out.println("List is Empty");
					//}
					if(head.data == st)
					{ //Check if the first node is the one to be deleted 
					    head=head.next;
					}
					if(head == null)
					{ // Check if there was only one element on Original list
					return true;
					}

					Node prev = head;
					Node curr = head.next;

					while (curr != null)
					{
					         if(curr.data.equals(st))
					         {
					             prev.next = curr.next;
					          }
					         else
					         {
					             prev = prev.next;
					          }        curr = curr.next ;
					          // no null pointer exception will be shown even if curr.next is null
					          }
					
					
					return true;
				
                   }*/
             public String Delete(String st) {
            	 Node currNode=start;
         		
         		Node prevNode=null;
         		
         		if(currNode.data.equalsIgnoreCase(st))
         		{
         			String s=start.data;
         			start=start.next;
         			return s;
         		}
         		
         		while(currNode != null && !currNode.data.equalsIgnoreCase(st))
         		{
         			prevNode=currNode;
         			currNode=currNode.next;
         		} 
         			prevNode.next = currNode.next;
         		return currNode.data;

			}

					

					
					
					
					
					
					
					
					
					
                        
public int size()
{ Node start=null;
	int j=0;
	
	Node t=start;
	
	while(t!=null)
	{
		j++;
		t=t.next;
	}
	return j;
}

}
             
             
             
             
             
             
             
             
             
             
             
             

