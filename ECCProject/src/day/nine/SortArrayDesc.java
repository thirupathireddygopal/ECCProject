package day.nine;

import java.util.Scanner;

public class SortArrayDesc {
	
	public static void sortArrayInDesc(int a[]){
		for(int i=0 ; i < (a.length-1) ; i++){
			for(int j = i+1 ; j<a.length ; j++){
				if(a[i] < a[j]){
					int temp =a[i];   // created int variable
					a[i] = a[j];   // a[j] is assigned to a[i]
					a[j] = temp;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		int a[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter"+a.length+"numbers");
		for(int i = 0 ; i < a.length ; i++){
			a[i] = sc.nextInt();
		}
		
		sortArrayInDesc(a);
		
		System.out.print("After sort :");
		for(int i = 0 ; i < a.length ; i++){
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
