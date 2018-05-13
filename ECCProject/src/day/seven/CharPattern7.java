package day.seven;

import java.util.Scanner;

public class CharPattern7 {
	
	public static String trianglePattern(int n){
		String result = "";
		String str = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(str.length());
		for(int i = 1 ; i <= n ; i++){
			for(int k = n ; k >= i ; k--){
				result += "-";
			}
			for(int j = 1 ; j <= i ; j++){
				result += str.charAt(j-1);
			}
			for(int j = (i-1) ; j >= 1 ; j--){
				result += str.charAt(j-1);
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines to print star:");
		int num = sc.nextInt();
		String result = trianglePattern(num);
		System.out.println(result);
		sc.close();
	}

}
