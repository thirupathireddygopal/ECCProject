package day.one;

public class TriangleArea {

	public static void main(String[] args) {
		int s1=5,s2=6,s3=7;
		int s = (s1+s2+s3)/2; 
		double tarea = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
		System.out.println("The triangle area is :" + tarea);
	}
}
