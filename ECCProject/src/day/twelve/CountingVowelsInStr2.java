package day.twelve;

import java.util.Scanner;

public class CountingVowelsInStr2 {
	
	public static int vowelsInStr(String str){
		int count=0;
		for(int i = 0 ; i <= (str.length()-1) ; i++){
			char c = str.toUpperCase().charAt(i);
			if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				count += 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("write a word to count no of vowels:");
		String str1 = sc.nextLine();
		int result = vowelsInStr(str1);
		System.out.println("the number of vowels in a given sentence:"+result);
		sc.close();
	}

}
