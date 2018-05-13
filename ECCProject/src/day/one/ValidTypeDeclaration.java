package day.one;

public class ValidTypeDeclaration {

	public static void main(String[] args) {
		// char declaration
		char c1 = 064770; // octal representation
		char c2 = 0xbeef; //hexadecimal
		char c3 = '\uface'; // unicode 
		System.out.println("064770-->" + 064770);
		System.out.println("0xbeef-->" + 0xbeef);
		System.out.println("\uface-->" + '\uface');
		
		// float declaration
		float f1 = -999;
		float f2 = 9.9F; // f is appended to literal
		float f3 = 9.9f; // f is appended to literal
		float f4 = 0x123; // integer literals
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		
		// boolean declaration
		boolean b1 = true;
		boolean b2 = false;
		
		// String declaration
		String s1 = "";
		String s2 = "\"";
		String s3 = null;
		String s4 = "'\"abc123";
		System.out.println("empty string-->"+s1);
		System.out.println("\"-->"+s2);
		System.out.println("null-->"+s3);
		System.out.println(s4);
		
	}

}
