package day.six;

import java.util.Scanner;

public class PrintMultiplicationTables {
	
	public static String printTables(int a,int b){
		String result ="";
		for(int i=a;i<=b;i++){
			for(int j=1;j<=10;j++){
				result += i +"x"+ j + "=" + (i*j) + "\n";
			}
			result +="\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the stating table no:");
		int start = sc.nextInt();
		System.out.println("enter the ending table no:");
		int end = sc.nextInt();
		String result = printTables(start,end);
		System.out.println(result);
	}

}
