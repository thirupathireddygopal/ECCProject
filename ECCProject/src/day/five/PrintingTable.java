package day.five;

public class PrintingTable {
	
	public static String printTable(int n){
		String result= "";
		for(int i=1;i<=10;i++){
			result += n + "x" + i + "=" + (n*i) + "\n";
		}
	return result;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String result = printTable(n);
		System.out.println(result);
		
	}

}
