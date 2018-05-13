package manipulatingStrings6;
public class MaskEmailID01_3 {
    public static void main(String[] args) {
        String email = "testmail@.mailme.com";
        System.out.println(maskMailID(email));
    }

    public static String maskMailID(String email) {
        String result ="";
        for(int i = 0 ; i < email.length() ; i++) {
        	if(i > 1 && i < email.indexOf('@')) {
        		result += "X";
        	}
        	else {
        		result += email.charAt(i);
        	}
        }
        return result;
    }

}
