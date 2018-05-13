package concepts;

public class AOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		System.out.println("the value of x is-->" + x);
		System.out.println("x++ is-->" + x++);
		System.out.println(x = 10);
		System.out.println("x++ + x++ is-->" + (x++ + x++));
		System.out.println(x = 10);
		System.out.println("x++ + ++x is-->" + (x++ + ++x));
		System.out.println(x = 10);
		System.out.println("++x + x++ is-->" + (++x + x++));
		System.out.println(x = 10);
		System.out.println("++x + ++x is-->" + (++x + ++x));
		System.out.println("x-- is-->" + x--);
		System.out.println("-----------------------");
	    // arithmetic expression *,/,%
		System.out.println("arithmetic expressions....");
		System.out.println(10*10 / 5 + 3 - 1*4 % 2/2);
		System.out.println("-----------------------");
		//left shift
		System.out.println("left shift...");
		System.out.println(10 << 3); // 10*2^3=10*8=80
		System.out.println("-----------------------");
		//right shift
		System.out.println("right shift...");
		System.out.println(10>>3); // 10/2^3=10/8=1
		System.out.println("-----------------------");
	}

}
