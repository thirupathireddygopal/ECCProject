package day.thirteen;

import java.util.Scanner;

public class GroundFloorVisits {
	
	public static String getFloorsCount(String str){
		int targetFloor = 0,groundFloorCounter = 1;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == '^'){
				targetFloor++;
			}
			else if(str.charAt(i)=='v'){
				targetFloor--;
			}
			else
				return "Error in Code";
			if(targetFloor==0)
				groundFloorCounter++;
		}
		return "Target Floor is "+targetFloor+" and ground floor vists are:"+groundFloorCounter;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the pattern:");
		String pattern = sc.nextLine();
		String result = getFloorsCount(pattern);
		System.out.println(result);
	}

}
