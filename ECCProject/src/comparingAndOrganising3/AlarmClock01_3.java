package comparingAndOrganising3;
public class AlarmClock01_3 {
    public static void main(String[] args) {
        int day_of_week = 3;
        boolean onVac = true;
        System.out.println(ringAlarm(day_of_week, onVac));
    }

    /*
     * sun = 0 , mon = 1,..sat = 6
     */
    public static String ringAlarm(int dayOfTheWeek, boolean onVac) {
    	String result = "";
    	if(dayOfTheWeek<0 || dayOfTheWeek>6){
    		result = "Invalid Inputs";
    	}
    	if((dayOfTheWeek>0 && dayOfTheWeek<6) && onVac==true){
    		result = "10:00";
    	}
    	if((dayOfTheWeek>0 && dayOfTheWeek<6) && onVac==false){
    		result = "07:00";
    	}
    	if((dayOfTheWeek==0 || dayOfTheWeek == 6)&& onVac == true){
    		result="OFF";
    	}
    	if((dayOfTheWeek==0 || dayOfTheWeek == 6)&& onVac == false){
    		result="10:00";
    	}
    	return result;
    }
}