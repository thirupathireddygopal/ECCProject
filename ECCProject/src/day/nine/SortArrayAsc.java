package day.nine;

import java.util.Scanner;

public class SortArrayAsc {
	
	// sorting array in ascending order(small to big)
	public static void sortArrayInAsc(int a[]){
		for(int i = 0 ; i < (a.length) ; i++){
			for(int j = (i+1) ; j < (a.length) ; j++){
				if(a[i] > a[j]){
					int temp = a[i];   // created temporary variable
					a[i] = a[j];   // a[j] is assigned to a[i]
					a[j] = temp;					
				}
				System.out.println("a[i]-->" + a[i]);
				System.out.println("a[j]-->" + a[j]);
			}						
		}
		return;
	}

	public static void main(String[] args) {
		int a[] = new int[5];		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter"+a.length+"numbers");
		
		for(int i = 0 ; i < (a.length) ; i++){
			a[i] = sc.nextInt();
		}
		
		sortArrayInAsc(a);
		
		System.out.print("After sort :");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		sc.close();
	}

}
