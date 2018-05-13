package day.thirteen;

import java.util.Scanner;

public class LuckyNumber {
	
	public static int getLuckyNumber(String dob){
		int luckyNumber = 0;
		String dates[] = dob.split("-");
		//System.out.println(dates[1]);
		for(int i =  0 ; i < (dates.length) ; i++){
			luckyNumber += Integer.parseInt(dates[i]);			
		}
		while(luckyNumber >= 10){
			luckyNumber = sumOfDigits(luckyNumber);
		}
		return luckyNumber;
	}
	
	public static int sumOfDigits(int num){
		int sum = 0,rem;
		while(num>0){
			rem = num%10;
			sum += rem;
			num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the dob:");
		String dob = sc.nextLine();
		int luckyNumber = getLuckyNumber(dob);
		System.out.println("the lucky number is:"+luckyNumber);
		sc.close();
	}

}
