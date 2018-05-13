package patternsAndStrings4;
public class StarPyramid01_1 {
    public static void main(String[] args) {
        System.out.print(starPattern(5));
    }

	public static String starPattern(int rows) {
		if(rows <= 0)
			return "-1";
		String result = "";
		 for(int i = 1 ; i <= rows ; i++) {
			 for(int k = rows ; k > i ; k--) {
				 result+="-";
			 }
			 for(int j = 1 ; j <= i ; j++) {
				 result += " *";
			 }
			 result += "\n";
		 }
		 return result;
	}
}
