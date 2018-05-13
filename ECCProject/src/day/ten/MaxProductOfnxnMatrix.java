package day.ten;

import java.util.Scanner;

public class MaxProductOfnxnMatrix {
	
	public static int maxProduct(int arr[][]) {
		int temp = 0;
		int product1 = 1;
		int product2 = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				product1 *= arr[i][j];
				//System.out.println("product1 is-->" + product1);
			}
			//System.out.println("Final product1 is-->" + product1);
			if(product1 > product2) {
				product2 = product1;
				product1 = 1;
				//System.out.println("Final product2 is-->" + product2);
			}
			else {
				temp = product1;
				product1 = 1;
			}
		}
		if(product2 > temp) {
			return product2;			
		}
		return temp;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the dimension of array:");
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		System.out.println("Reading : enter the values for nxn matrix");
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		int result = maxProduct(a);
		System.out.println("maximum product is: " + result);
		sc.close();
	}
}
