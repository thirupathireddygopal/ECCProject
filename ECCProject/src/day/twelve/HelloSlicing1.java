package day.twelve;

public class HelloSlicing1 {
	
	public static String getCharacters(String str){
		String result = "";
		for(int i = 0 ; i < str.length() ; i++){
			result += str.charAt(i) + "\n";
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "HELLO WORLD";
		String result = getCharacters(str);
		System.out.println(result);
	}

}
