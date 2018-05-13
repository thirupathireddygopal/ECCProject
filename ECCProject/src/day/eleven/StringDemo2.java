package day.eleven;

public class StringDemo2 {
	
	
	/*
	 * str1.equals(str2)  --> It compares values of objects.
	 * str1==str2  --> It compares address of object.
	 * str var-->[using new keyword],here the address remains is not same.	
	*/

	public static void main(String[] args) {
		String str1 = new String("Hello"); //object data stored in Heap-Memory
		String str2 = new String("Hello");
		String str3 = new String("Hi");
		
		System.out.println("the address of str1: "+str1.hashCode());
		System.out.println("the address of str2: "+str2.hashCode());
		System.out.println("the address of str3: "+str3.hashCode());
		
		System.out.println("checking str1 and str2 values: "+ str1.equals(str2));
		System.out.println("checking str1 and str2 address: "+ (str1.hashCode()==str2.hashCode()));
		System.out.println("checking str1 and str2 references: "+ (str1 == str2));
		
		System.out.println("checking str1 and str3 values: "+ str1.equals(str3));
		System.out.println("checking str1 and str3 address: "+ (str1.hashCode()==str3.hashCode()));
		System.out.println("checking str1 and str3 references: "+ (str1 == str3));
	}

}
