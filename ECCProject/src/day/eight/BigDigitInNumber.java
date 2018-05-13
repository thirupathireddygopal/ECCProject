package day.eight;

import java.util.Scanner;

public class BigDigitInNumber {
	
	public static int findBig(int num){
		int big = 0 , n;
		while(num > 0){
			n = num % 10;
			if(n > big){
				big = n;
				System.out.println(big + " big");
			}
			num = num / 10;
			System.out.println(num + " yeah! divided");
		}
		return big;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get the biggest digit: ");
		int n = sc.nextInt();
		int result = findBig(n);
		System.out.println("the biggest digit in the number is: " + result);
		sc.close();
	}

}
