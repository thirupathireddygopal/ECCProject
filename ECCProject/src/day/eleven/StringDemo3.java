package day.eleven;

public class StringDemo3 {

	// string var-->[without new keyword] value and address changes upon changing manipulating the value.
	public static void main(String[] args) {
		// STACK-MEMORY
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("value before change:"+ str1);
		System.out.println("Address before change:"+str1.hashCode());
		System.out.println("references before change:" + str1 == str2);
		str1 = str1+" Hi";
		System.out.println("value after change:"+str1);
		System.out.println("Address after change:"+ str1.hashCode());
		System.out.println("references before change:" + str1 == str2);
		
		System.out.println("----------------------------------------");
		// HEAP-MEMORY
		String c = new String("hey");
		String d = new String("hey");
		System.out.println("value before change:"+ c);
		System.out.println("Address before change:"+c.hashCode());
		System.out.println("references before change:" + c == d);
		c = c+" Hi";
		System.out.println("value after change:"+c);
		System.out.println("Address after change:"+ c.hashCode());
		System.out.println("references before change:" + c == d);
	}

}
