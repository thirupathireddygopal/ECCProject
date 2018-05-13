package comparingAndOrganising3;
public class RoundSum01_4 {
    public static void main(String[] args) {
        int a = 23, b = 34, c = 69;
        System.out.println(sumOfMultiples(a, b, c));
    }

    public static int sumOfMultiples(int a, int b, int c) {
    	if(a<=0 || b<=0 || c<=0){
    		return -1;
    	}
    	int result = 0;
    	//rounding a
    	if(a%10==0){
    		result+=a;
    		System.out.println("1f"+result);
    	}
    	else{
    		result+=((a/10)*10 + 10);
    		System.out.println(result);
    	}
    	//rounding b
    	if(b%10==0){
    		result+=b;
    		System.out.println("2f"+result);
    	}
    	else{
    		result+=((b/10)*10 + 10);
    		System.out.println(result);
    	}
    	//rounding c
    	if(c%10==0){
    		result+=c;
    		System.out.println("3f"+result);
    	}
    	else{
    		result+=((c/10)*10 + 10);
    		System.out.println(result);
    	}
    	return result;
    }
}