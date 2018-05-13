package day.seven;

import java.util.Scanner;

public class starPattern3 {
	public static String trianglePattern(int n){
		String result="";
		for(int i=1;i<=n;i++){
			for(int k=n;k>=i;k--){
				result+="-";
			}
			for(int j=1;j<=i;j++){
				result+=" *";
			}
			result+="\n";
		}
		for(int i=n-1;i>=1;i--){
			for(int k = 0 ; k <= (n-i) ; k++){ 		// here k <= (n-i) 
				result+="-";
			}
			for(int j=1;j<=i;j++){
				result+=" *";
			}
			result+="\n";
		}
		return result;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines to print star:");
		int num = sc.nextInt();
		String result = trianglePattern(num);
		System.out.println(result);
		sc.close();
	}

}
