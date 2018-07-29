package concepts;

public class ANewKeyword {
	String name = "thiru";
	
	boolean bo;
	char c;
	
	byte b;
	short s;
	int i;
	long l;
	
	float f;
	double d;
	
	public static void main(String[] args) {
		// using new keyword
		ANewKeyword nKey = new ANewKeyword();
		System.out.println("String-->"+nKey.name);
		System.out.println("-------------------");
		System.out.println("boolean-->" + nKey.bo);
		System.out.println("-------------------");
		System.out.println("char-->" + nKey.c);
		System.out.println("-------------------");
		System.out.println("byte-->" + nKey.b);
		System.out.println("short-->" + nKey.s);
		System.out.println("int-->" + nKey.i);
		System.out.println("long-->" + nKey.l);
		System.out.println("-------------------");
		System.out.println("float-->" + nKey.f);
		System.out.println("double-->" + nKey.d); 
	}

}
