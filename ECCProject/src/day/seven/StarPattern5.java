package day.seven;

import java.util.Scanner;

public class StarPattern5 {
	
	public static String numberPattern(int n){
		String result="";
		int c=0;
		for(int i = 1 ; i <= n ; i++){
			for(int k = n ; k >= i ; k--){
				result += "-";
			}
			for(int j = 1 ; j <= i ; j++){
				c++;
				result += "s"+c;
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines to print star:");
		int num = sc.nextInt();
		String result = numberPattern(num);
		System.out.println(result);
		sc.close();
	}

}
