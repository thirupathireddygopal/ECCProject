package day.eight;

import java.util.Scanner;

public class SecondBigDigitInNum {
	
	public static String findMaxAndSecondMaxDigits(int num){
		int max = 0 , secondMax = 0;
		while(num > 0){
			int rem = num % 10;
			
			if(rem > max){
				secondMax = max;
				System.out.println("the Second Biggest--> " + secondMax);
				max = rem;
				System.out.println("the Biggest--> " + max);
			}
			
			else if(rem > secondMax && rem != max){
				secondMax = rem;
				System.out.println("the Second Biggest--> " + secondMax);
				System.out.println("the Biggest--> " + max);
			}
			num = num/10;
			System.out.println(num + " yeah! divided");
		}
		String result = "Biggest Digit is--> "+max+ " Second Biggest digit is--> "+secondMax;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get the 2nd biggest digit: ");
		int n = sc.nextInt();
		String result = findMaxAndSecondMaxDigits(n);
		System.out.println("the 2nd biggest digit in the number is: " + result);
		sc.close();
	}

}
