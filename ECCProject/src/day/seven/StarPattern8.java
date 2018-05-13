package day.seven;

import java.util.Scanner;

public class StarPattern8 {
	
	public static String boxPattern(int num) {
		String result = "";
		for(int i = 1 ; i <= 4 ; i++) {
			for(int j = 1 ; j <= 4 ; j++) {
				if(i == 1 || i == 4 || j == 1 || j == 4) {
					result += num;
				}
				else {
					result += num-1;
				}							
			}
			result += "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		String result = boxPattern(num);
		System.out.println(result);
		sc.close();
	}

}
