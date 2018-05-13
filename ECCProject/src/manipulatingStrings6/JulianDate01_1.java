package manipulatingStrings6;
//import java.time.Year;

public class JulianDate01_1 {
    public static void main(String[] args) {
        String date = "23-dec-2016";
        System.out.println(dateFormat(date));
    }
   
    public static String dateFormat(String date) {
    	String[] dmy = date.split("-");
    	int dd = Integer.parseInt(dmy[0]);
    	int mon = convertMMMtoMM(dmy[1]);
    	int year = Integer.parseInt(dmy[2]);
    	return year+julianDate(dd, mon);
    	}
   
   public static String julianDate(int dd, int monResult) {
	   String day = "";
	   int[] months = {0,31,59,90,120,151,181,212,243,273,304,334};
	   int jd = months[monResult-1]+dd;
	   //System.out.println(jd);	   
	   if(jd <= 9) {
		   day = "00"+jd;
	   }
	   else if(jd <= 99) {
		   day = "0"+jd;
	   }
	   else {
		   day += jd;
	   }
	   //System.out.println("day-->"+day);
	   return day;
   }
   
   public static int convertMMMtoMM(String mon) {
	  int monResult = 0;
      String months = "janfebmaraprmayjunjulaugsepoctnovdec";
      mon = mon.substring(0,3);
      mon = mon.toLowerCase();
      //System.out.println(months.indexOf(mon));
      monResult += (months.indexOf(mon)/3) + 1;
      System.out.println("index of month-->" + months.indexOf(mon));
      System.out.println("monResult-->" + monResult);
      return monResult;
   }
}