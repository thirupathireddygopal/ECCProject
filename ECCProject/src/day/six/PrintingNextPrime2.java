package day.six;

import java.util.Scanner;

public class PrintingNextPrime2 {
	
	public static boolean isPrime(int n){
		for(int i = 2 ; i <= n/2 ; i++){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static int getNextPrime(int n){
		
		// usage of while loop 
		while(!(isPrime(++n))) //condition true, pre_incrementation.
		{
			// do nothing
			System.out.println( n + " is not a prime number");
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("give a number to print the next prime:"); // given number is 13
		int num = sc.nextInt();
		int result = getNextPrime(num);
		System.out.println("the next Prime number is:"+result);
		
	}

}
