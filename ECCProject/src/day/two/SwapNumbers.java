package day.two;

public class SwapNumbers {
	//method definition
	public static String swapNumbers(int a,int b){
		int temp = a;
		a = b;
		b = temp;
		String result ="A is " + a + "B is " + b;
		return result;
	}

	public static void main(String[] args) {
		int a = 10,b = 20;
		System.out.println("the values before swapping are A = " + a + "B = " + b);
		String swap = swapNumbers(a,b);
		System.out.println("the swapped number are: "+swap);
	}

}
