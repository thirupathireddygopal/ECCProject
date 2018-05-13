package day.two;

public class CastDemo1 {

	public static void main(String[] args) {
		//implicit type casting
		byte b= 100;
		int i = b;
		System.out.println("The value of b =" + b);
		System.out.println("The value of i =" + i);		
		//explicit type casting:
		int i2=100;
		byte b2 = (byte)i2;
		System.out.println("The value of b2 =" + b2);
		System.out.println("The value of i2 =" + i2);				
	}
}
