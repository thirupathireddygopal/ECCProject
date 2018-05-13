package modularizingPrograms5;
public class Armstrong01_2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 1999;
        System.out.println(generateArmstrongNums(num1, num2));
    }
    
    public static String generateArmstrongNums(int start, int limit) {
        if(start<=0 || limit<=0) {
        	return "-1";
        }
        if(start>=limit) {
        	return "-2";
        }
        String result="";
        for(int i=start;i<=limit;i++) {
        	//System.out.println("entered generateArmstrongNums");
        	//System.out.println(i);
        	if(isArmstrong(i)) {
        		result += i + ",";
        	}
        }
        if(result.length() == 0){
        	return "-3";
        }
        result = result.substring(0,result.length()-1);
        System.out.println("result is---------------------------->" + result);
    	return result;
    }

    public static boolean isArmstrong(int num) {
    	//System.out.println("entered isArmstrong");
        if(sumOfPowersOfDigits(num)==num) {
        	return true;
        }
        else {
        	return false;
        }
    }

    public static int sumOfPowersOfDigits(int n) {
    	//System.out.println("entered sumOfPowersOfDigits");
    	int sum = 0;
    	int digits[]=getDigits(n);
    	for(int i=0;i<digits.length;i++){
		   sum += power(digits[i],digits.length);
    	}
       
       System.out.println(sum);
       return sum;
    }

    public static int[] getDigits(int n) {
    	//System.out.println("entered getDigits");
    	int temp = n,countDigits = 0;
    	while(temp>0){
    		temp = temp/10;
    		countDigits++;
    	}
        int a[]= new int[countDigits];
        int rem,i=0;
        while(n>0) {        	
        	rem = n%10;
        	System.out.println("rem is-->" + rem);
        	a[i] = rem;
        	//System.out.println("value "+a[i]);
        	i++;
        	n = n/10;
        }
        //System.out.println(a);
        return a;
    }

    public static int power(int d, int p) {
        int result = (int) Math.pow(d, p);
        return result;
    }
}
