package day.twelve;

public class RevStartingStringCaptial4 {
	
	public static String startingCharCapital(String str){
		String result="";
		for(int i = (str.length()-1) ; i >= 0 ; i--){
			if(i == (str.length()-1) || str.charAt(i+1) == ' '){
				System.out.println("i value-->" + i);
			result += str.toUpperCase().charAt(i);
			}
			else{
				result += str.toLowerCase().charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String str = "HELLO WORLD";
		String result = startingCharCapital(str);
		System.out.println(result);
	}

}
