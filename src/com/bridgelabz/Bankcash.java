package com.bridgelabz;

public class Bankcash {
	int  amt;
	int balance=1000;
		
            public int  deposit(int amt)
         {
        	 balance=balance+amt;
        	 System.out.println(balance);
        	 return balance ;
         }
            
            public int withdraw(int amt)
            {
            	if(balance<100){
            	System.out.println("invalid amount"); 
            	return amt;
            	}
            else if(amt<=balance)
            {
            	balance =balance-amt;
            	System.out.println(balance);
            	return balance;
            	
            	
            }
				return amt;
            }
            }


