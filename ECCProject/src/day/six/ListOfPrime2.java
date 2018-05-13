package day.six;

import java.util.Scanner;

public class ListOfPrime2 {
	
	public static boolean isprime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	public static String primeNumbers(int a,int b){
		String result = "";
		int count = 0;
		for(int i=a;i<=b;i++){
			if(isprime(i)){
				if(count == 0) { // explicitly for counting prime numbers.
					result += i;
				}
				else {
					result += ","+i;
				}
				count++;
			}
		}
		System.out.println("the number of prime numbers-->" + count);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number:");
		int start = sc.nextInt();
		System.out.println("enter ending number:");
		int end = sc.nextInt();
		String result = primeNumbers(start,end);
		System.out.println(result);
	}

}
