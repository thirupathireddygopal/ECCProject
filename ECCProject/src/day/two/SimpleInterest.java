package day.two;

public class SimpleInterest {
	
	//method description
	public static double getSimpleInterest(double pa,double ri,int tp){		
		double si = (pa*tp*ri)/100;
		return si;
	}
	
	//main method
	public static void main(String[] args) {
		//double p = 1000.0;
		//double r = 2.0;
		//int t = 1;
		//double s = (p*t*r)/100;
		//System.out.println("the simple interest is: ");
		double pa = 1000.0;
		double ri = 2.0;
		int tp = 1;
	    double si = getSimpleInterest(pa,ri,tp);//method calling
	    System.out.println("the simple interest: "+ si);	
	}

}
