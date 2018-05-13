package day.ten;

import java.util.Scanner;

public class FindNumberOfZerosInNumber {

	public static int zerosInNumber(int num){
		int zeros=0;
		if(num == 0){
			return 1;
		}
		while(num>0){
			int r = num%10;
			if(r == 0){
				zeros+=1;
			}
			num = num/10;
		}
		return zeros;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get the no of zeros: ");
		int n = sc.nextInt();
		int result = zerosInNumber(n);
		System.out.println("the number of zeros in a given number are : " + result);
		sc.close();
	}

}
