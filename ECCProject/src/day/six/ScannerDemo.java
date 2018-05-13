package day.six;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Reading-->Enter your name:");
		String name = sc.next();
		System.out.println("Reading-->Enter your age:");
		int age = sc.nextInt();
		System.out.println("Reading-->Enter your salary:");
		double salary = sc.nextDouble();
		sc.close();
		
		System.out.println("Printing-->my name is :"+name);
		System.out.println("Printing-->my age is :"+age);
		System.out.println("Printing-->my salary is :"+salary);
	}

}
