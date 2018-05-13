package day.ten;

import java.util.Scanner;

public class MaxProductOfnxnMatrixColRow {
	
	public static int maxProduct(int arr[][]) {
		int rtemp = 0 , ctemp = 0 ,dtemp = 0, maxRowProduct = 0 , maxColProduct = 0 , colk = 0;
		int rproduct1 = 1 , cproduct1 = 1 , dproduct1 = 1;
		int rproduct2 = 0 , cproduct2 = 0 , dproduct2 = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(i==j) {
					dproduct1 *= arr[i][j];
				}
				rproduct1 *= arr[i][j];
				colk = i;
				cproduct1 *= arr[j][colk];
				//System.out.println("rproduct1 is-->" + rproduct1);
			}
			if(dproduct1 > dproduct2) {
				dproduct2 = dproduct1;
				dproduct1 = 1;
				//System.out.println("Final rproduct2 is-->" + rproduct2);
			}
			else {
				dtemp = dproduct1;
				dproduct1 = 1;
			}
			//System.out.println("Final rproduct1 is-->" + rproduct1);
			if(rproduct1 > rproduct2) {
				rproduct2 = rproduct1;
				rproduct1 = 1;
				//System.out.println("Final rproduct2 is-->" + rproduct2);
			}
			else {
				rtemp = rproduct1;
				rproduct1 = 1;
			}
			if(cproduct1 > cproduct2) {
				cproduct2 = cproduct1;
				cproduct1 = 1;
				//System.out.println("Final rproduct2 is-->" + rproduct2);
			}
			else {
				ctemp = cproduct1;
				cproduct1 = 1;
			}
		}
		
		if(rproduct2 > rtemp) {
			maxRowProduct = rproduct2;			
		}
		else{
			maxRowProduct = rtemp;
		}
		
		if(cproduct2 > ctemp) {
			maxRowProduct = cproduct2;			
		}
		else{
			maxRowProduct = ctemp;
		}
		
		if(maxRowProduct >= maxColProduct) {
			return maxRowProduct;
		}
		return maxColProduct;
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
