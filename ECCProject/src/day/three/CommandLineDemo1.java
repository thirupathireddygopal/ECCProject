package day.three;

public class CommandLineDemo1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
	}

}

/*
Wrapper Classes:-
----------------
primitive type		Wrapper Class		conversion method
--------------		-------------		----------------
	int				Integer				static int parseInt()
	byte			Byte				static byte parseByte()
	short			Short
	long			Long
	
	float			Float
	double			Double
	
	boolean			Boolean
	char			Character		
*/