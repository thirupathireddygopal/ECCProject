package day.six;

import java.util.Scanner;

public class PrimeTest1 {
	
	public static boolean isPrime(int n){
		for(int i = 2 ; i <= n/2 ; i++){
			if(n%i == 0)     // when reminder is 0[zero] then we can say it is not a prime number
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		boolean result = isPrime(n);
		if(result==true)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}

}
