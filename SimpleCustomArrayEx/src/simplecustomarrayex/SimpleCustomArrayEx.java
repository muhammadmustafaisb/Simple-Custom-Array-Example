package simplecustomarrayex;

import java.util.Scanner;

public class SimpleCustomArrayEx {

	
	public static void main(String[] args) {

//		int n;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number of element in Array");
//		n = scanner.nextInt(); 
//		
//		int a[] = new int[n];
//		System.out.println("Enter the values");
//		
//		for (int i = 0; i<n;i++) {
//			
//			a[i] = scanner.nextInt();
//			
//		}
//		
//		System.out.println("Element are");
//		for(int i = 0; i<n; i++) {
//			
//			System.out.println(a[i]);
//			
//		}
//		

		
		int arrelement,indexelement,indexvalue,indexdelet;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the values of the element ");
		arrelement = scanner.nextInt();
		
		int a[] = new int [arrelement];
		int b[] = new int [arrelement + 1];
		int c[] = new int [arrelement - 1];
		
		System.out.println("enter the values");
		
		for(int i = 0 ; i < arrelement ; i++) {
			
			a[i] = scanner.nextInt();
			
		}
		
		System.out.println("Enter the Index values");
		indexelement = scanner.nextInt();
		System.out.println("Enter the Value");
		indexvalue = scanner.nextInt();

		for(int j = 0; j< arrelement+1;j++) {
			
			if(j<indexelement) {
				
				b[j]=a[j];
				
			}
			
			else if(j==indexelement) {
				
				b[j]=indexvalue;
				
			}
			
			else {
				
				b[j] = a[j-1];
			}
		}
		
		System.out.println("Element are ");
		for (int i = 0 ; i < arrelement+1 ; i++) {
			
			System.out.println(b[i]);
		}
		
		System.out.println("Enter the index you want to delet");
		
		indexdelet = scanner.nextInt();
		
		for (int i = 0 ; i<a.length ; i++) {
			if(i< indexdelet) {
				
				b[i] = a[i];
				
			}
			
			else if (i==indexdelet) {
				continue;
			}
			
			else {
				
				b[i-1] = a[i];
			}
		}
		
		
		System.out.println("Element are ");
		for (int i = 0 ; i < arrelement+1 ; i++) {
			
			System.out.println(b[i]);
		}
		
		
	}

}
