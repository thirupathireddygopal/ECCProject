package day.eleven;

public class StringDemo1 {
	
	/*
	 * str1.equals(str2)  --> It compares values of objects.
	 * str1.hashCode() == str2.hashCode() --> it compares addresses of the object
	 * str1 == str2  --> It compares references of object.
	 * creating the string variable without using new keyword,here the address remains the same.
	 */

	public static void main(String[] args) {
		String str1 = "Hello"; // stack-memory
		String str2 = "Hello";
		String str3 = "Hi";
		
		System.out.println("the address of str1: "+str1.hashCode());
		System.out.println("the address of str2: "+str2.hashCode());
		System.out.println("the address of str3: "+str3.hashCode());
		
		System.out.println("checking str1 and str2 values:"+ str1.equals(str2));
		System.out.println("checking str1 and str2 address:"+ (str1.hashCode()==str2.hashCode()));
		System.out.println("checking str1 and str2 references:"+ (str1==str2));
		
		System.out.println("checking str1 and str3 values:"+ str1.equals(str3));
		System.out.println("checking str1 and str3 address:"+(str1.hashCode()==str3.hashCode()));
		System.out.println("checking str1 and str3 references:"+(str1==str3));
	}
}


