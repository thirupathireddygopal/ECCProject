package patternsAndStrings4;
public class FourPerLine01_3 {
    public static void main(String[] args) {
        int num = 99;
        System.out.println(getFourPerLine(num));
    }

	public static String getFourPerLine(int num) {
         if(num<1 || num>99) {
        	 return "-1";
         }
         
         String result = "";
         for(int i=1;i<=num;i++) {
        	 if(i<10) {
        		 result+=" "+i+" ";
        	 }
        	 else {
        		 result+=i+" ";
        	 }
        	 /*if(i == 4) {
        		 result+=" ";
        	 }*/
        	 if(i%4 == 0) {
        		 result = result.substring(0,result.length()-1);
        		 result+="\n";
        	 }        	 
        	 if(i==num) {
        		 result = result.substring(0,result.length()-1);        		 
        	 }
         }         
         /*if(num%4 == 0) {
        	 result+="\n";
         }*/
         return result;
	}
}
