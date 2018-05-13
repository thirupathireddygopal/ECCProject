package day.ten;

import java.util.Scanner;

public class TwoDImArray1 {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("Reading : enter values for 2x2 matrix:");
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 2 ; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing : the given 2x2 matrix is:");
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 2 ; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); //entering the next line
		}
		sc.close();
	}

}
