package day.two;

public class Adding_digits {
	//method definition
	public static int sumOf2Digits(int n){
		int fd = n/10;
		int ld = n%10;
		int sum = fd+ld;
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 36;
		int sum = sumOf2Digits(n); //method call
		System.out.println("the sum of 2 digits is :" + sum);
	}

}
