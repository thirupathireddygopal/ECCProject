package day.ten;

import java.util.Scanner;

public class NumOfZerosInArray {
	
	public static int zerosInNumber(int num){
		int zeros = 0;
		if(num == 0){
			return 1;
		}
		while(num>0){
			int r = num%10;
			if(r == 0){
				zeros+=1;
			}
			num = num/10;
		}
		return zeros;	
	}
	
	public static int getCountOfZeros(int a[]){
		int counter = 0;
		for(int i=0;i<a.length;i++){
			counter+=zerosInNumber(a[i]);
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no of elements in an Array-->a[elements]:");
		int arraySize = sc.nextInt();
		int a[] = new int[arraySize];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}		
		int result = getCountOfZeros(a);
		System.out.println("the number of Zeors in an Array is: " + result);
		sc.close();
	}

}
