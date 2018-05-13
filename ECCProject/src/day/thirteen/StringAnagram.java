package day.thirteen;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	
	// creative <--> reactive
	public static String sort(String str){
		char c[] = str.toCharArray();
		System.out.println("string before sorting-->" + String.valueOf(c));
		// Arrays.sort()-->directly sorts. 
		Arrays.sort(c);
		
		//String str1 = String.valueOf(c);
		System.out.println("string after sorting-->" + String.valueOf(c));
		
		for(int i = 0 ; i < c.length ; i++) {
			System.out.println("c[i]-->" + c[i]);
		}		
		// converted from char[] to string
		String result  = new String(c);		
		System.out.println("result-->" + result);
		return result;
	}

	public static boolean isAnagram(String str1,String str2){
		if(sort(str1).equals(sort(str2))){
			return true;
		}
		else
			return false;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string:");
		String str1 = sc.nextLine();
		System.out.println("enter another string:");
		String str2 = sc.nextLine();
		boolean result = isAnagram(str1,str2);
		if(result==true){
			System.out.println("it is anagram");
		}
		else
			System.out.println("it is not a anagram");
		sc.close();
	}

}
