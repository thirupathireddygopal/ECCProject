package gettingStarted1;
public class Palindrome01_1_3 {
    public static void main(String[] args) {
        int num = 8889;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num) {
    	if(num<0 || num>999 || num<=99)
    		return -1;
    	if(num>99 && num<=999){
    		if (num/100==num%10){
    			return 1;
    		}    		
    	}
			return 0;
    		
    }
}
		    	