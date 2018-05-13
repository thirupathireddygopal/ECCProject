package day.eleven;

public class StringBufferDemo4 {

	// string-buffer address does not change upon manipulating value
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Hello");
		System.out.println("value before change:"+ str1);
		System.out.println("Address before change:"+str1.hashCode());
		str1.append(" Hi");
		System.out.println("value after change:"+str1);
		System.out.println("Address after change:"+ str1.hashCode());
	}

}

