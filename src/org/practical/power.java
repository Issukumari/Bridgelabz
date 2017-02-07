
	package org.practical;

	

	class power
	{

		 static  int getpower(int n,int c)
		 {
			
			 int pow=1;
		   while(c>0)
		   {
	    	   pow=pow*n;
	    	   c--;
	    	   }
		   return pow;
		 }
	
		public static void main(String[] args) {
			
		
		int n =Integer.parseInt(args[0]);
				   for (int i=0 ;i<31;i++)
				   {
					int result=  getpower(2, i);
					  System.out.println(n+"^"+i+" = "  + result);
				   }
			   
			   }

}
