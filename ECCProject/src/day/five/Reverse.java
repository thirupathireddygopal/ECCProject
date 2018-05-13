package day.five;

public class Reverse {
	public static int reverse(int n){
		int rem, rev = 0;
		while(n>0){
			rem = n%10;
			rev = (rev*10) + rem;
			n= n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int rev = reverse(n);
		System.out.println("reverse of the number is:" + rev);
		if (n==rev)
			System.out.println("it is palindrome");
		else
			System.out.println("it is not palindrome");
	}

}

