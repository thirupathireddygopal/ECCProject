package day.nine;

import java.util.Scanner;

public class UniqueElementArr {

	public static String uniqueNum(int[] a) {
		if(a.length == 0) {
			return "array is empty";
		}
		if(a.length == 1) {
			return ""+a[0];
		}
		if(a.length == 2) {
			if(a[0] == a[1]) {
				return ""+0;
			}
			else {
				return  ""+a[0]+","+a[1];
			}
		}
		String result = "";
		int count = 0;
		int temp = 0;
		for(int i = 0 ; i < a.length ; i++) {
			temp = a[i];
			System.out.println("temp : " + temp);
			for(int j = 0 ; j < a.length ; j++) {
				if(a[i] == a[j]) {
					count++;
				}
			}
			if(count >= 2) {
				count = 0;
			}
			else{
				result += temp + ",";
				count = 0;
				System.out.println("outside for uNum: " + result);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of an array");
		int len = sc.nextInt();
		int[] a = new int[len];
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("enter elements");
			a[i] = sc.nextInt();
		}
		String result = uniqueNum(a);
		System.out.println("unique Numbers is : " + result);
	}
}
