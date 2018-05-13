package modularizingPrograms5;
public class OddPalindromes01_1 {
    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = 2000;
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) {
        if(start <= 0 || limit <= 0) {
        	return "-1";
        }
        if(start >= limit) {
        	return "-2";
        }
    	String result = "";
    	int count = 0;
    	for(int i = start ; i <= limit ; i++) {
    		//System.out.println(i);
    		if(isPalindrome(i)){
    			if(isAllDigitsOdd(i)) {
    				count++;
    				//System.out.println(count);
    				result += i+",";
    				//System.out.println(result);
    			}    			
    		}    		
    	}
    	if(count == 0){
    		return "-3";
    	}
    	result = result.substring(0,result.length()-1);
    	return result;
    }

    public static boolean isPalindrome(int num) {
    	//System.out.println("entered isPalindrome");
        if(num == reverse(num)) {
        	return true;
        }
        else {
        	return false;
        }
    }

    public static int reverse(int num) {
    	//System.out.println("entered reverse");
        int rev = 0, rem;        
        while(num > 0) {
        	rem = num % 10;
        	rev = (rev * 10) + rem;
        	num = num / 10;        	
        }
        //System.out.println(rev);
        return rev;
    }

    public static boolean isAllDigitsOdd(int num) {
    	//System.out.println("entered isAllDigitsOdd");
    	int rem;
    	while(num > 0) {
    		rem = num % 10;
    		if(rem%2 == 0) {
    			return false;
    		}
    		num = num / 10;
    	}
    	return true;
    }
}