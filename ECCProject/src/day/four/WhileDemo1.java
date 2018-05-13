package day.four;

public class WhileDemo1 {
	
	public static String whileLoop(int n){
		int x = 1;
		String result = "";
		while(x<=n){
			result += x+" ";
			x++;
		}
		return result;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String result = whileLoop(n);
		System.out.println(result);
		/*int x = 1,y=0;
		while(x<=10){
			System.out.println(x);
			y = y+x;
			x++;
		}
		System.out.println(y);*/
	}

}
