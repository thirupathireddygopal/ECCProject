package comparingAndOrganising3;
public class Max3Num01_1 {
    public static void main(String[] args) {
        int n1 = 42;
        int n2 = 56;
        int n3 = 12;
        System.out.println(getMaxNumber(n1, n2, n3));
    }

    public static int getMaxNumber(int num1, int num2, int num3) {
    	if(num1<=0 || num2<=0 || num3<=0){
    		return -1;
    	}
    	int big = num1;
		if (num2>big)
			big=num2;
		if (num3>big)
			big=num3;
		return big;
    }
}