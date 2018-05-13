package day.eleven;

import java.util.Scanner;

public class BiggestElementIn3X3 {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Reading: Enter the element values of 3x3:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing: The values of 3x3 Matrix are:");
		for(int i=0;i<a.length;i++){
			int big = 0;
			for(int j = 0 ; j < (a.length) ; j++){
				if(a[i][j] > big){
					big = a[i][j];
				}
				System.out.print(a[i][j]+" ");				
			}
			System.out.println(" Big = "+big);
		}
		sc.close();
	}

}
