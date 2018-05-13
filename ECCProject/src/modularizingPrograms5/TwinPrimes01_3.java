package modularizingPrograms5;
public class TwinPrimes01_3 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 200;
        System.out.println(twinPrimes(num1, num2));
    }

    public static String twinPrimes(int start, int limit) {
        if(start<=0 || limit<=0) {
        	return "-1";
        }
        if(start>=limit) {
        	return "-2";
        }
        String result = "";
        int temp1,temp2,diff,n;
        for(int i = start ; i <= limit ; i++) {
        	if(isPrime(i)) {
        		temp1 = i;
        		//System.out.println("temp1= "+temp1);
        		n = i+1;
        		while(n<=limit){
        			if(isPrime(n)) {
        				temp2 = n;
        				//System.out.println("temp2= "+temp2);
        				diff = (temp2-temp1);
        				//System.out.println("diff= "+diff);
        				if(diff == 2) {
        					//System.out.println("twin primes are:"+temp1+"," + temp2);
        					result += temp1 + ":" + temp2 + ",";
        					break;
        				}        				
        			}
        			n++;
        		}
        	}        	
        }        
        if(result.length() == 0) {
    		return "-3";
    	}
        result = result.substring(0,result.length()-1);
        return result;
    }

    public static boolean isPrime(int num) {
    	if(num == 1) {
    		return false;
    	}
        for(int i = 2 ; i <= num/2 ; i++) {
        	if(num % i == 0) {
        		return false;
        	}        	
        }
        return true;
    }
}
