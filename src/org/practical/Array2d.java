package org.practical;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class Array2d {
	
	public void Save(){

		 try {
		    PrintWriter writer = new PrintWriter(new File());
int a[]=new int [a.length];
		    for(int i=0; i<a.length; i++){
		        for(int j=0; j<a.length; j++){

		        
		       	a[i][j]=Interger.parseInt(scan.next()) 
		                    
		        }
		       writer.println(); 
		    }

		    writer.flush();  //
		    writer.close();      



		   } catch (FileNotFoundException e) {      
		     e.printStackTrace();
		   }}

		public static void main(String[] args) {
		    try {
		        ObjectOutputStream toFile = new ObjectOutputStream(new FileOutputStream("//home//user//array.DATA"));
		        toFile.writeObject(args);
		        toFile.close();
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
}}
		
	}

}
