package com.bridgelabz;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class linklist {

             FileWriter fw =null; 


public String[] getfile()
{
	   FileWriter fw =null; 
	   try
	   {
		 fw=new FileWriter("/home/bridgeit/springPractice/smita/src/com/bridgelabz/file/k.txt") ; 
	   } 
	   catch (IOException e1) 
	   {
		   e1.printStackTrace();
		}
        
	   
	       try
	       {
	       fw.write("camel,lion,cat,dog,deer");
	       fw.flush();
	       }
	       catch(IOException e)
	       {
	       e.printStackTrace();
	   }
	       FileReader fr = null;
			String st = "";
			
			try {
				fr = new FileReader("/home/bridgeit/springPractice/smita/src/com/bridgelabz/file/k.txt");
				int x = fr.read();

				while (x != -1) {
					char c = (char) x;
					st = st + c;
					x = fr.read();

				}
			} catch (Exception e11) {
				e11.printStackTrace();
			}
			
			String[]str = st.split(",");
			
			return str;
           }
			public boolean addToFile(String st)
			{
				
				try 
				{
					fw = new FileWriter("/home/bridgeit/springPractice/smita/src/com/bridgelabz/file/k.txt", false);
					fw.write("");
					fw.write(st);
					fw.flush();
					fw.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
				return true;
			}
             }

