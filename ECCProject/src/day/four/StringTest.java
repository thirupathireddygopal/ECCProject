package day.four;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello1";
		String str2 = "hello1";
		String str3 = new String("hello");
		String str4 = str3;
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str4 == str3);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}

}
