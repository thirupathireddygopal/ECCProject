package gettingStarted1;
public class SumOfDigits01_1_1 {
    public static void main(String[] args) {
        int num = 799;
        System.out.println(getSumOfDigits(num));
    }

    public static int getSumOfDigits(int num)	{
    	int sum = 0 , rem;
    	if (num>9 && num<100){
    		int fd = num/10;
        	int ld = num%10;
        	sum = fd + ld;
        	return sum;
    	}    	
    	else {
    		while(num > 0) {
    			rem = num % 10;
    			sum += rem;
    			num = num / 10;
    		}
    		return sum;
    	}
    }
}