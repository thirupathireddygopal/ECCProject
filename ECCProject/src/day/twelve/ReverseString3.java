package day.twelve;

public class ReverseString3 {
	
	public static String reverseCharacters(String str){
		String result = "";
		for(int i = (str.length()-1) ; i >= 0 ; i--){
			result += str.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "HELLO WORLD";
		String result = reverseCharacters(str);
		System.out.println(result);
	}

}
