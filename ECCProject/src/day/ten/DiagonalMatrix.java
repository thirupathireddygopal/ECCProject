package day.ten;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Reading : enter values for 3x3 matrix:");
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing : the given 3x3 Diagonal matrix is:");
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				if(i == j){
					System.out.println(a[i][j]+ " ");
				}
				else{
					System.out.print("-");
				}
				
			}
			System.out.println(); //entering the next line
		}
		sc.close();
	}

}
