package day.one;

public class DatatypesDemo {

	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("Character.MIN_VALUE-->"+Character.MIN_VALUE);
		System.out.println("Character.MAX_VALUE-->"+Character.MAX_VALUE);
		
		System.out.println("Byte.MIN_VALUE-->"+Byte.MIN_VALUE);
		System.out.println("Byte.MAX_VALUE-->" + Byte.MAX_VALUE);
		
		System.out.println("---------------------------------");
		
		System.out.println("Short.MAX_VALUE-->" + Short.MAX_VALUE);
		System.out.println("Short.MIN_VALUE-->" + Short.MIN_VALUE);
		
		System.out.println("---------------------------------");
		
		System.out.println("Integer.MIN_VALUE-->" + Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE-->" + Integer.MAX_VALUE);
		
		System.out.println("---------------------------------");
		
		System.out.println("Long.MIN_VALUE-->" + Long.MIN_VALUE);
		System.out.println("Long.MAX_VALUE-->" + Long.MAX_VALUE);
		
		System.out.println("---------------------------------");
		
		System.out.println("max_byte-->" + (Math.pow(2, 7)-1)); //indicates +ve values of byte datatype
		System.out.println("max_long-->" + (Math.pow(2,63)-1));
		
		System.out.println("---------------------------------");
		
		System.out.println("Float.MIN_VALUE-->" + Float.MIN_VALUE);
		System.out.println("Float.MAX_VALUE-->" + Float.MAX_VALUE);
		
		System.out.println("---------------------------------");
		
		System.out.println("Double.MIN_VALUE-->" + Double.MIN_VALUE);
		System.out.println("Double.MAX_VALUE-->" + Double.MAX_VALUE);
		
		System.out.println("---------------------------------");
		
		System.out.println("18/20 -->" + (18/20));
		System.out.println("18 % 20 -->" + (18 % 20));
		
		System.out.println("---------------------------------");
		
		System.out.println("empty string-->"+""); // empty string
		System.out.println("\"");
		System.out.println("This is a " + "two-line string"); //string valued-constant expression formed from 2 strings
	}

}
