package org.practical;

import java.util.Scanner;

public class Stopwatch 
{
	  long start;
	  long end;
	  long  dTime;
       
	  
	  public void starTimer()
        {
		 start=System.currentTimeMillis();
		
		}
	  public void stopTimer()
      {
	  end=System.currentTimeMillis();
	  }
	  
	  public long TimeElapsed()
	  {
		  dTime=end-start;
		  return dTime;
		  
	  }
	  
	  public static void main(String[] args) 
                 {
		 Stopwatch s=new Stopwatch();
		 Scanner scn=new Scanner(System.in);
               System.out.println("press key to starttimer");
               scn.nextLine();
                 s.starTimer();
                 
                 System.out.println("press key to stoptimer");
                 scn.nextLine();
                   s.stopTimer();
               	
           		System.out.println("time elapsed is "+ s.TimeElapsed()+ "millis");
           		System.out.println("time elapsed in secs "+ s.TimeElapsed()/1000+ "sec");   
                           
                     }
	  }
                 
