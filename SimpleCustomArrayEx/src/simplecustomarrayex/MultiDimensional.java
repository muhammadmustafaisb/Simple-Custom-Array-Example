package simplecustomarrayex;

import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {

		int arr1,arr2;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number of Rows = ");
		arr1 = s.nextInt();
		System.out.println("Enter The Number of Colums = ");
		arr2  = s.nextInt();
		int arr[][]  = new int[arr1][arr2]; 
		System.out.println("Enter The Number of Values = ");
		for(int i = 0; i<arr1; i++) 
		{
		
			for(int j = 0; j<arr2; j++) {
				
				arr[i][j] = s.nextInt();
				
			}
			
		}
		
		
		for(int i = 0; i<arr1; i++) 
		{
		
			for(int j = 0; j<arr2; j++) {
				
				System.out.print(arr[i][j]+" " );
			}
			
			System.out.println();
		}
		
	}

}
