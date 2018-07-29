package day.one;

public class ValidTypeDeclaration {

	public static void main(String[] args) {
		// primitive data-types doesn't have hashCode value
		// primitive : boolean declaration[1 - bit]
		boolean b1 = true;
		boolean b2 = false;
		String bs1 = "true"; // true or TRUE, other than true or false the value is false.
		System.out.println("b1 == b2 : " + (b1 == b2));
		
		System.out.println("Boolean.valueOf(b2) : " + Boolean.valueOf(b2)); // boolean argument
		System.out.println("Boolean.valueOf(bs1) : " + Boolean.valueOf(bs1)); // string argument
		
		
		Boolean b3 = new Boolean("TRUE"); // true or TRUE or True
		Boolean b4 = new Boolean("FALSE");
		System.out.println("Boolean b3-->" + b3);
		System.out.println("Boolean b4-->" + b4);
		System.out.println("b3.booleanValue() : " + b3.booleanValue());
		System.out.println("b3.hashCode() : " + b3.hashCode());
		System.out.println("b3.compareTo(b4) : " + b3.compareTo(b4));
		System.out.println("b3.equals(b4) : " + b3.equals(b4));
		System.out.println("b3.toString() : " + b3.toString());
		
		System.out.println("b3 == b4 : " + (b3 == b4));
		System.out.println("--------------------------------");
		
		// primitive : character declaration [2-bytes]
		char c1 = 'b';
		char c2 = '\n'; // whitespace (or) \t : [horizontal line] (or) \n : feed line
		System.out.println("c1 : " + c1);
		
		System.out.println("Character.valueOf(c1) : " + Character.valueOf(c1));
		System.out.println("Character.MAX_VALUE : " + Character.MAX_VALUE);
		System.out.println("Character.MIN_VALUE : " + Character.MIN_VALUE);
		System.out.println("Character.isLetterOrDigit(c1) : " + Character.isLetterOrDigit(c1));
		System.out.println("Character.isAlphabetic(c1) : " + Character.isAlphabetic(c1));
		System.out.println("Character.isDigit(c1) : " + Character.isDigit(c1));
		System.out.println("Character.isLowerCase(c1) : " + Character.isLowerCase(c1));
		System.out.println("Character.isUpperCase(c1) : " + Character.isUpperCase(c1));
		System.out.println("Character.isWhitespace(c2) : " + Character.isWhitespace(c2));
		System.out.println("Character.toLowerCase(c1) : " + Character.toLowerCase(c1));
		System.out.println("Character.toUpperCase(c1) : " + Character.toUpperCase(c1));
		System.out.println("Character.toString(c1) : " + Character.toString(c1));
		
		Character c4 = new Character('B');
		Character c5 = new Character('B');
		System.out.println("Character c4.charValue() : " + c4.charValue());
		System.out.println("Character c4.hashCode() : " + c4.hashCode());
		System.out.println("c4 == c5 : " + (c4 == c5));
		
		char c6 = 064770; // octal representation
		char c7 = 0xbeef; // hexadecimal
		char c8 = '\uface'; // unicode 
		System.out.println("064770-->" + 064770);
		System.out.println("0xbeef-->" + 0xbeef);
		System.out.println("\uface-->" + '\uface');		
		System.out.println("--------------------------------");
		
		// primitive : integer declaration[4 - bytes]
		int i1 = 3;
		System.out.println(i1);
		
		
		// float declaration
		float f1 = -999;
		float f2 = 9.9F; // f is appended to literal
		float f3 = 9.9f; // f is appended to literal
		float f4 = 0x123; // integer literals
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println("--------------------------------");


		// String declaration
		String s1 = "";
		String s2 = "\"";
		String s3 = null;
		String s4 = "'\"abc123";
		System.out.println("empty string : "+s1);
		System.out.println("\"back\"-->"+s2);
		System.out.println("null : "+s3);
		System.out.println(s4);
		System.out.println("--------------------------------");
	}

}
