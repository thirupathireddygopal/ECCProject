package generatingSequences2;
public class RussMult01_2_3 {
    public static void main(String[] args) {
        System.out.println(getProduct(27, 35));
    }
    
    /*
     * The idea is to half the first number and to double the second number repeatedly till the first number becomes 0. 
     * In the process, whenever the first number become odd, add the second number to result
     */ 
    
    public static String getProduct(int num1, int num2) {
        if(num1<=0 || num2<=0){
        	return "-1";
        }
        if(num1>=100000 || num2>=100000){
        	return "-2";
        }
        String result = "";
        int sum = 0;
        boolean isFirst = true;
                
        while(num1 > 0){
        	if(num1 % 2 != 0){  // condition becomes odd
        		System.out.println("num1-->" + num1);
        		sum += num2;
        		System.out.println("product in if block-->" + sum);
        		if(isFirst){
        			System.out.println("entered isFirst block..");
        			result += num2;
        			isFirst = false;
        		}
        		else{
        			result += "+" + num2;
        		}        	
        	}
        	num1 /= 2;
        	System.out.println("After division num1-->" + num1);
        	num2 *= 2;
        	System.out.println("After multiplication num2-->" + num2);
        }
        result += " = " + sum;
        return result;
    }
}