package day.eleven;

import java.util.Scanner;

public class StringRevNoPositionChange {
	
	public static String strRevNoPos(String str) {
		String result = "";
		String a[] = str.split(" ");
		System.out.println("the length of an Array is: " + a.length);		
		for(int i=0 ; i <= a.length-1 ; i++) {
			System.out.println("enterd 1st loop");
			System.out.println("a[0] value is: " + a[0]);
			for(int j = a[i].length()-1 ; j>=0 ; j--) {
				System.out.println("entered 2nd loop");
				if(j==a[i].length()-1) {
					result += a[i].toUpperCase().charAt(j);
				}
				else {
					result += a[i].toLowerCase().charAt(j);
				}
			}
			result += " ";
		}		
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to get rev with position not changed:");
		String str = sc.nextLine();
		String result = strRevNoPos(str);
		System.out.println(result);
		sc.close();
	}

}
