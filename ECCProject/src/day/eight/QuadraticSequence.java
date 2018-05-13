package day.eight;

import java.util.Scanner;

public class QuadraticSequence {
	
	public static String getQuadraticSequence(int num) {
		String result = "";
		int presentValue = 0;
		for(int i = 1 ; i <= num ; i++) {
			presentValue += i;
			result += presentValue + ",";
		}
		System.out.println("result -->" + result);
		result = result.substring(0, result.length()-1);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the number to get Quadratic sequence : ");
		int num = sc.nextInt();
		String result = getQuadraticSequence(num);
		System.out.println(result);
		sc.close();
	}

}
