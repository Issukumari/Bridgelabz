package org.practical;

public class sum 
		{
		
		
			boolean find3Numbers(int A[], int arr_size, int sum) 
			{
				//int n=arr_size;

	
				for (int i = 0; i < A.length - 2; i++) 
				{
				
					for (int j = i + 1; j < A.length - 1; j++) 
					{
						for (int k = j + 1; k < A.length; k++) 
						{
							if (A[i] + A[j] + A[k] == sum) 
							{
								System.out.print("Triplet is " + A[i] + " ," + A[j] + " ," + A[k]);
								return true;
							}
						}
					}
				}

		
				return false;
			}

	
			public static void main(String[] args) 
			{
				sum triplet = new sum();
				int A[] = {6,7,-3,2,1};
				int sum = 0;
				int arr_size = A.length;

				triplet.find3Numbers(A, arr_size, sum);
			


	}

}
