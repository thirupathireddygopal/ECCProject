package day.twelve;

import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.nextLine();
		String result = longestSubstring(str);
		System.out.println("longest result-->"+result);
		sc.close();
	}

	private static String longestSubstring(String str) {
		String sresult = "";
		String lresult = "";
		for(int i = 0 ; i < str.length() ; i++) {
			lresult += str.charAt(i);
			for(int j = i+1 ; j <= str.length()-1 ; j++) {
				if(lresult.contains(""+str.charAt(j))){
					if(sresult.length() < lresult.length()) {
						i = j;
						sresult = lresult;
						lresult = "";
						break;
					}					
				}
				else {
					lresult += str.charAt(j);
				}
			}
		}
		if(lresult.length() > sresult.length()) {
			return lresult;
		}
		return sresult;
	}
}
