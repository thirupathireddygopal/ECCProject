package gettingStarted1;
public class NextHundred01_1_2{
    public static void main(String[] args) {
        int num = 8726;
        System.out.println(getNextMultipleOf100(num));
    }
    public static int getNextMultipleOf100(int num) {
        if(num<=0)
        	return -1;
        if(num>0){
        	int result = ((num+99)/100)*100;
        	//System.out.println(result);
        	return result;
        }
        return num;
        //return result;
    }
}
