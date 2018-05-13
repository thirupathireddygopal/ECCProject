package day.nine;

import java.util.Scanner;

public class ArrayDemo {
	
	public static String searchArray(int a[],int n){
		String result = "Not found";
		for(int i = 0 ; i < (a.length) ; i++){
			if(a[i] == n){
				result = "number found";
				return result;
			}
		}		
		return result;
	}

	public static void main(String[] args) {
		int a[] = {10,5,3,7,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		String result = searchArray(a,n);
		System.out.println(result);
		sc.close();
		
	}

}
