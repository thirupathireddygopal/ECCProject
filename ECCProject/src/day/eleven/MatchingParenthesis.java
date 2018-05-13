package day.eleven;

public class MatchingParenthesis {
	
	public static boolean isMatchingParenthesis(String str) {
		int counter1 = 0 , counter2 = 0 ;
		for(int i = 0 ; i < str.length() ; i++) {
			if((str.charAt(i))=='(') {
				counter1++;
			}
			else if(str.charAt(i) == ')') {
				counter2++;
			}
		}
		if(counter1 == counter2) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isMatchingParenthesis("(2+3)"));
		System.out.println(isMatchingParenthesis("((a+b)*c)"));
		System.out.println(isMatchingParenthesis(")(a+b)*c)"));
		System.out.println(isMatchingParenthesis(""));
		System.out.println(isMatchingParenthesis(null));
	}

}
