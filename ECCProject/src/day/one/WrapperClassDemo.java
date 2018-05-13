package day.one;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a1 = 9;
		int a2 = 9;
		System.out.println(a1 == a2); // true. here no [a1.equals(a2)]-->wrong
		
		// wrapper class are similar to string immutable.
		Integer i1 = 127; // Here [i1] is the object of class Integer
		Integer i2 = 127; // Here [i2] is the object of class Integer 
		//and both of these objects are referring to same memory location 127
		System.out.println(i1 == i2); // true--> checks weather these objects points to same memory location or not 
		
		/* caching (or) pointing to same memory of integer value happens to a certain limit
		 * In case of integers cashing occurs up-to 127 beyond that it does not happen 
		 */
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println(i3 == i4); // false
		
		Integer num1 = new Integer(55); // int-primitive here we don't need to use Integer.parseInt(string)
		System.out.println("num1--> " + num1); // result-->55
		
		Integer num2 = new Integer("55"); // string -primitive
		System.out.println("num2--> " + num2); // result-->55
		
		Float f1 = new Float(55.05); // double argument- primitive
		System.out.println("f1--> " + f1); // result-->55.05
		
		Float f2 = new Float("55.05f"); // string argument - primitive
		System.out.println("f2--> " +f2); // result--> 55.05
		
		Float f3 = new Float(55.05f); // float argument- primitive
		System.out.println("f3--> " + f3); // result--> 55.05

	}

}
