package day.four;

public class WhileDemo2 {
	
	public static int addNumber(int n){
		int x = 1,sum = 0;
		while (x<=n){
			sum = sum + x;
			x++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int result = addNumber(n);
		System.out.println("the sum of numbers is: " + result);
		
	}

}
