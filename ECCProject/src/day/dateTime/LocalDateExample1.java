package day.dateTime;

import java.util.Date;

public class LocalDateExample1 {

/*The java.time, java.util, java.sql and java.text packages contains classes for representing date and time.
*/	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// current date
		Date date = new Date();
		System.out.println("current date-->" + date);
		
		Date date1 = new Date(2018-1900, 2, 6);
		System.out.println("date2-->" + date1);
		
		// current date along with milliseconds
		long mills = System.currentTimeMillis();
		Date date2 = new Date(mills);
		System.out.println("current date along with milliseconds-->" + date2);
		
		Date sunday = new Date(2018-1900, 2, 4);
		Date monday = new Date(2018-1900, 2, 5);
		Date tuesday = new Date(2018-1900, 2, 6);
		
		// boolean checking if present date is before(given date) or after(given date)
		boolean test1 = sunday.equals(sunday); // true
		boolean test2 = sunday.before(monday); // true
		boolean test3 = monday.after(sunday); // true
		System.out.println("date3 is before date2-->" + test1);
		System.out.println("date3 is after date2-->" + test2);
		System.out.println("date3 is after date2-->" + test3);
		
		/* 3 Comparison of dates
		 * returns int-->[0] if dates are equal
		 * returns int-->[1] if present date is after the previous date
		 * returns int-->[-1] if present date is before the previous date  
		 */
		int comparision1 = monday.compareTo(monday); // monady = monday so, 0
		int comparision2 = monday.compareTo(tuesday); // monday < tuesday so, -1
		int comparision3 = monday.compareTo(sunday); // monday > sunday so, +1 
		System.out.println("comparision1-->" + comparision1);
		System.out.println("comparision2-->" + comparision2);
		System.out.println("comparision3-->" + comparision3);
	}

}
