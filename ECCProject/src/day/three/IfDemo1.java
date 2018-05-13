package day.three;

public class IfDemo1 {
	
	public static String evenOdd(int n){
		if(n%2==0){
			return "Even Number";
		}
		else
		{
			return "Odd Number";
		}
		
	}

	public static void main(String[] args) {
		int n = 10;
		String result = evenOdd(n);
		System.out.println("the given number is " + result);
	}

}

/*
Simple if
---------
if(condition)
{
statements;
}

if-else
-------
if(condition)
{
statements;
}
else
{
statements;
}

if-else-if
----------
if(condition)
{
statements;
}
else if(condition2)
{
statements;
}
else
{
statements;
}
*/
