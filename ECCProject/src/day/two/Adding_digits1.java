package day.two;

public class Adding_digits1 {
	//method definition
	public static String sumOf2Digits(float n){
		String result = "";
		float fd = n/10;
		System.out.println("the value of float/10 is-->" + fd);
		float ld = n%10;
		System.out.println("the value of float%10 is-->" + ld);
		result += fd+ld;
		return result;
	}
	
	public static void main(String[] args) {
		float n = 21.4f;
		System.out.println("the value of n = 21.4f is :" + n);
		String s = sumOf2Digits(n); // calling the static method
		System.out.println("the sum of 2 digits in String return type is-->" + s);
		
		Double d1 = Double.parseDouble(s);
		Integer i1 = d1.intValue();
		
		double d2 = Double.parseDouble(s);
		int i2 = (int)d2;
		
		System.out.println("the sum of 2 digits in Double(class) return type is-->" +d1);
		System.out.println("the sum of 2 digits in Integer(class) return type is-->" +i1);
		System.out.println("the sum of 2 digits in double(primitive) return type is-->" +d2);
		System.out.println("the sum of 2 digits in int(primitive) return type is-->" +i2);
		
		/* changing from one class to another class
		 * class to its primitive type [unboxing]
		 * type casting to another primitive type [casting]
		 * changing to another class [boxing]
		 */
		Double myDouble = Double.valueOf(10.0);	
		double dPri = myDouble.doubleValue(); 
		int intgr = (int) dPri;               
		Integer val = Integer.valueOf(intgr);
		
		System.out.println("the value of myDouble is-->" + myDouble);
		System.out.println("changing from Double class to primitive double[unboxing] is-->" + dPri);
		System.out.println("[casting] from double to int  is-->" + intgr);
		System.out.println("changed into Integer class[boxing] is-->" + val);
		
		/* changing from one class to another class
		 * shortcut : no need of type casting	
		 */
		// int --> String conversion[String.valueOf(int)]
		int idemo = 20;
		String sint = String.valueOf(idemo);
		System.out.println(sint + "twenty");
		
		// float --> int conversion[Integer.valueOf(float.intVlaue())]
		Float myFloat = 3.3333f;		
		System.out.println("the value of myFloat is-->" + myFloat);
		
		Integer ifloat = Integer.valueOf(myFloat.intValue());		
		System.out.println("the value of ifloat is-->"+ ifloat);
		
		String sfloat = String.valueOf(myFloat);
		System.out.println("the value of sfloat is-->"+ sfloat);
	}
}

/*DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
String weekdays[] = dfs.getWeekdays();
        
Calendar cal = new GregorianCalendar(Locale.US);
cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

System.out.println(weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase());*/

