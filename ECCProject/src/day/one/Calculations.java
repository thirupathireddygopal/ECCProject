package day.one;

public class Calculations {

	public static void main(String[] args) {
		int a = 9,b=5;
		double c = 1.02; // 64-bit precision IEE 754 MORE precise
		float d = 1.02f; // 32-bit precision IEE 754 LESS precise than double 
		System.out.println("double c is :" + c);
		System.out.println("float d is :" + d);
		System.out.println("The sum is :" + (a+b));
		System.out.println("The sub is :" + (a-b)); 
		System.out.println("The mul with double is :" + (a*b*c)); //45.9
		System.out.println("The mul with float is :" + (a*b*d));  //45.899998
		System.out.println("The div is :" + (a/b));
		System.out.println("The rem is :" + (a%b));
	}
}
