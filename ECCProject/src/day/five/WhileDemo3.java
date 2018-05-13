package day.five;

public class WhileDemo3 {
	public static int getSumOfDigits(int n){
		int rem, sum = 0;
		while(n>0){
			rem = n%10;
			System.out.println("reminder r-->" + rem);
			sum = sum + rem;
			n= n/10;
			System.out.println("number after divison-->" + n);
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int sum = getSumOfDigits(n);
		System.out.println("the sum of digits of the number is:" + sum);
	}

}
