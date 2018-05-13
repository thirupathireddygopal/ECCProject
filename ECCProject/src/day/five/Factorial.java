package day.five;

public class Factorial {
	
	public static int fact(int n){
		System.out.println(n);
		int factorial = 1;
		for(int i=n;i>=1;i--){
			factorial = factorial*i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println("given number is-->" + n);
		int result = fact(n);
		System.out.println("the factorial is: " + result);
	}

}
