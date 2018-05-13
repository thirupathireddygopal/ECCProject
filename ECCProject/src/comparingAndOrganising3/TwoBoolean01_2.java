package comparingAndOrganising3;
public class TwoBoolean01_2 {
    public static void main(String[] args) {
        boolean b1 = true, b2 = true, b3 = false;
        System.out.println(countBoolean(b1, b2, b3));
    }
    
    public static boolean countBoolean(boolean b1, boolean b2, boolean b3) {
    	if((b1==true && b2==true)||(b2==true && b3==true)||(b3==true && b1==true)){
    		return true;
    	}
    	return false;
    }
    
    /*public static boolean countBoolean1(boolean b1, boolean b2, boolean b3) {
    	Boolean result=false;
         if(b1==true && b2==true && b3==true){
        	 result = true;
        	 //System.out.println("entered1");
         }
         if(b1==true && b2==true && b1!=b3 && b2!=b3){
        	 result = true;
        	 //System.out.println("entered2");        	 
         }
         if(b2==false && b3==false && b1!=b2 && b1!=b3){
        	 result = false;
        	 //System.out.println("entered3");        	 
         }
         if(b1==false && b2==false && b3==false){
        	 result = false;
        	 //System.out.println("entered4");        	 
         }
         return result;
     }*/
}
