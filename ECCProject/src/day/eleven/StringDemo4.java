package day.eleven;

public class StringDemo4 {

	public static void main(String[] args) {
		String str1 ="ATalent";
		System.out.println("str1--> " + str1);
		String str2 = "BSprint";
		System.out.println("str2--> " + str2);
		String str3 = "Talent_ Sprint ";
		System.out.println("str3--> " + str3);
		String str4 = "bread23bread";
		System.out.println("str4 : " + str4);
		String str5 = "1A& a";
		System.out.println("str5 : " + str5);
		System.out.println("------------------------");
		System.out.println("checking weather a character is a isDigit or not : "+ Character.isDigit(str5.charAt(0)));
		System.out.println("checking weather a character is a isAlphabetic or not : "+ Character.isAlphabetic(str5.charAt(1)));
		System.out.println("checking weather a character is a isLetter or not : "+ Character.isLetter(str5.charAt(1)));
		System.out.println("checking weather a character is a isLetterOrDigit or not : "+ Character.isLetterOrDigit(str5.charAt(2)));
		System.out.println("checking weather a character is a isSpcaeChar or not : "+ Character.isSpaceChar(str5.charAt(3)));
		System.out.println("checking weather a character is a isUpperCase or not : "+ Character.isUpperCase(str5.charAt(4)));
		System.out.println("------------------------");
		System.out.println("Length of str1: "+str1.length());
		System.out.println("Length of str2: "+str2.length());
		System.out.println("length of str3: "+str3.length());
		System.out.println("------------------------");
		System.out.println("Giving firstindex of character-->str1.indexOf('T'): "+str1.indexOf("T"));
		System.out.println("Giving fisrtindex of character-->str1.indexOf('ent'): "+str1.indexOf("ent"));
		System.out.println("giving lastindex of character-->str4.lastindexOf('bread'): " + str4.lastIndexOf("bread"));
		System.out.println("Giving character at-->str1.charAt(0): "+str1.charAt(0));
		System.out.println("Giving character at-->str1.charAt(5): "+str1.charAt(5));
		System.out.println("------------------------");
		System.out.println("string array");
		String[] s = str1.split("");		
		for(int i = 0 ; i < s.length ; i++) {
			System.out.println("spliting string-->str1.spilt():"+s[i]);
		}
		System.out.println("------------------------");
		System.out.println("character array");
		char[] c = str1.toCharArray();
		for(int i = 0 ; i < c.length ; i++) {
			System.out.println("character array elements:"+c[i]);
		}		
		System.out.println("------------------------");
		System.out.println("str1.substring(3,6)-->(start=included,end=excluded): "+str1.substring(3,6));
		System.out.println("------------------------");
		System.out.println("str1 in Uppercase is: "+str1.toUpperCase());
		System.out.println("str1 in Lowercase is: "+str1.toLowerCase());
		System.out.println("------------------------");
		System.out.println("Checking string-->str1.contains(Talen): "+str1.contains("Talen"));
		System.out.println("Checking character-->str1.contains(T): "+str1.contains("T"));
		System.out.println("------------------------");
		System.out.println("str1.equals(str2): "+str1.equals(str2));
		System.out.println("str1.equalsIgnoresCase(str1): "+str1.equalsIgnoreCase(str1));
		System.out.println("str1.equalsIgnoresCase(str2): "+str1.equalsIgnoreCase(str2));
		System.out.println("------------------------");
		if(str1.compareTo(str2) < 0) {  //comparing lexicographically or dictionary order[T < S-->false]
			System.out.println("Yes");  // A < B true[less]-[result-->(-1)]
		}else {
			System.out.println("No");
		}
		System.out.println("str1.compareTo(str1): "+str1.compareTo(str2));
		System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));		
		System.out.println("------------------------");
		System.out.println("boolean check if string suffix ends with some string : " + str1.endsWith("ent"));
		System.out.println("boolean check if string is empty or not-->" + str1.isEmpty());
		System.out.println("Trimming the last character-->str3.trim(): "+str3.trim());
		System.out.println("------------------------");
		System.out.println("str1.replace('Atalent','replaced') : " + str1.replace("ATalent", "Replaced"));
		
		String odd = "candy";
		System.out.println("odd.length()/2-->" + odd.length()/2);
	}

}

/*
String Methods
--------------
1) length(string1)
2) toUpperCase()
3) toLowerCase()
4) str1.equals(str2)
5) equalsIgnoreCase()
6) compareTo()
7) contains()
8) substring(begin index,no. of character/end index)
8) charAt()
9) indexOf()
10) toCharArray()
11) split()
12) trim()
*/
