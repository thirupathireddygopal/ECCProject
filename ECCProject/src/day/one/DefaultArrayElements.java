package day.one;

// default array elements
public class DefaultArrayElements {
	static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bl;
	public static void main(String str[])
	{
		//default values of primitive values
		System.out.println("Byte :"+b);
		System.out.println("Short :"+s);
		System.out.println("Int :"+i);
		System.out.println("Long :"+l);
		System.out.println("Float :"+f);
		System.out.println("Double :"+d);
		System.out.println("Char :"+c);
		System.out.println("Boolean :"+bl);
		
		System.out.println("----------------------");
		boolean b[] = new boolean[5]; // boolean array elements
		char c[] = new char[5];     // char array elements-space
		
		byte by[] = new byte[5]; // byte array elements
		short sh[] = new short[5]; // short array elements
		int i[] = new int[5]; // int array elements
		long l[] = new long[5]; // long array elements
		
		float f[] = new float[5]; // float array elements
		double d[] = new double[5]; // double array elements
		
		String s[] = new String[5]; // string array elements
		
		System.out.println("Boolean : " + b[0]);
		System.out.println("Character : " + c[0]);
		
		System.out.println("Byte : " + by[0]);
		System.out.println("short : " + sh[0]);		
		System.out.println("Integer "+i[0]);
		System.out.println("long : " + l[0]);
		
		System.out.println("Float "+ f[0]);
		System.out.println("Double " + d[0]);
		
		System.out.println("String " + s[0]);
		System.out.println("Hello World");
	}
}
