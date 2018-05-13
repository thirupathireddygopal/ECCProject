package patternsAndStrings4;
public class StarPyramid02_2 {
    public static void main(String[] args) {
        System.out.print(starPattern(6));
    }

	public static String starPattern(int rows) {
		if(rows<0)
			return "-1";
		if(rows==0)
			return "-2";
		String result = "";
		 for(int i = 1 ; i <= rows ; i++) {
			 for(int k = rows ; k > i ; k--) {
				 result+="-";
			 }
			 for(int j = 1 ; j <= (i+(i-1)) ; j++) {
				 result += "*";
			 }
			 result += "\n";
		 }
		 return result;
    }
}
