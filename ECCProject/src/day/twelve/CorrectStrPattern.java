package day.twelve;

import java.util.Scanner;

public class CorrectStrPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ordered string");
		String str1 = sc.nextLine();
		System.out.println("enter the unordered string");
		String str2 = sc.nextLine();
		String reqStr = str2 + str2;
		System.out.println(reqStr);
		if(reqStr.contains(str1)) {
			System.out.println("it is a substring..");
		}
		sc.close();
	}

}
