package day.nine;

import java.util.Scanner;

public class SmallestNumberInArray {
	
	public static int findSmallest(int a[]){
		int small = a[0];
		for(int i = 1 ; i < a.length ; i++){
			if(a[i] < small){
				small = a[i];
			}
		}
		return small;
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an array of "+a.length+" to find smallest digit:");
		for(int i = 0 ; i < a.length ; i++){
			a[i] = sc.nextInt();
		}
		int small = findSmallest(a);
		System.out.println("the smallest number is:" + small);
		sc.close();
	}
}
