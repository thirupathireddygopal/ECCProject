package day.three;

public class FindBig {

	public static int FindLarg(int a,int b){
		if (a>b){
			return a;
		}
		else
		{
			return b;
		}
	}
		
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int larg=FindLarg(a,b);
		System.out.println("the largest number is:"+larg);
	}

}
