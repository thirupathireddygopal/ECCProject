package day.three;

public class LargestOf3Numbers {
	
	public static int largestOf3(int a, int b, int c){
		int big = a;
		if (b>big)
			big=b;
		if (c>big)
			big=c;
		return big;
		/*if (a>b && a>c)
			return a;
		else if (b>c)
			return b;
		else
			return c;*/
		
	}

	public static void main(String[] args) {
		/*int a=56,b=65,c=55;
		int result = largestOf3(a,b,c);
		System.out.println("the largest value is :"+result);*/
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int result = largestOf3(a,b,c);
		System.out.println("the largest value is:" + result);
	}

}
