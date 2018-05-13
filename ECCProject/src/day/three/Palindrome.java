package day.three;

public class Palindrome {
	
	//checking palindrome for a 3-digit number ex:121,454,545..
	public static int isPalindrome(int a){
		if (a/100==a%10){
			System.out.println("it is a Palindrome");
			return 1;
		}
		else if (a<0){
			return -1;
		}
		else {
			return 0;
		}
		}
	
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int result = isPalindrome(a);
		System.out.println("the result is:" + result);
	}

}
