package day.twelve;

public class ChangCamelUnderscore5 {
	
	public static String changeCaseAndUnder(String str){
		String result = "";
		if(str.contains("_")){
			String arr[] = str.split("_");
			result += arr[0];
			for(int i = 1 ; i < arr.length ; i++){
				result += (arr[i].substring(0,1).toUpperCase()) + (arr[i].substring(1,arr[i].length()));
			}
		}
		else{
			for(int i = 0 ; i < str.length() ; i++){
				if(Character.isUpperCase(str.charAt(i))){
					result += "_" + str.toLowerCase().charAt(i);
				}
				else{
					result += str.charAt(i);
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(changeCaseAndUnder("talentSprint"));
		System.out.println(changeCaseAndUnder("talent_sprint"));
	}

}
