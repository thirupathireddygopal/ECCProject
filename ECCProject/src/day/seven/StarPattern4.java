package day.seven;

import java.util.Scanner;

public class StarPattern4 {
	
	public static String boxPattern(int n){
		String result="";
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= n ; j++){
				if(i == 1 || i == n || j == 1 || j == n){
					result+=" *";
				}
				else{
					result += "ab";
				}
			}
			result+="\n";
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of lines to print star:");
		int num = sc.nextInt();
		String result = boxPattern(num);
		System.out.println(result);
		sc.close();
	}

}
