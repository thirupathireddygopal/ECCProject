package generatingSequences2;
public class Collatz01_2_4 {
    public static void main(String[] args) {
        System.out.println(getCollatzSequence(2));
    }

    public static String getCollatzSequence(int number) {
    	int count = 0;
    	String result = "" + number;
	    if(number <= 0){
	    	return "Error";
	    }
	    while(number != 1 || count < 2){
	    	System.out.println("count value-->" + count);
	    	if(number % 2 == 0){
	    		number /= 2;
	    		result += " "+number;
	    	}
	    	else{
	    		number = (number*3)+1;
	    		result+=" "+number;
	    	}
	    	count++;
	    	if(count >= 100){
	    		return "Does not Converge";
	    	}
	    }
	    return result;
    }
}

