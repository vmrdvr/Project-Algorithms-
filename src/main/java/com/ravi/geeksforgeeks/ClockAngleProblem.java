package com.ravi.geeksforgeeks;

public class ClockAngleProblem {

	static double findAngle(double hour, double min) {
		if(hour<0 || hour>12 || min <0|| min>60)return 0;
		
		double totalTimeInMin = 0;
		if (hour < 12) {
			totalTimeInMin = (hour * 60) + min;
		} else {
			hour = 0;
			totalTimeInMin = min;
		}

		double hourAngle = totalTimeInMin * 0.5;
		double minAngle = min * 6;

		double angleBetweenHourAndMin = hourAngle > minAngle ? hourAngle - minAngle : minAngle - hourAngle;

		System.out.println("Angle Between Hour hand and Minute Hand : " + angleBetweenHourAndMin);
		return angleBetweenHourAndMin;
	}
	static void meetingPoint(){
			int h=0;
		int s=360;
		
		while(h<12){
			int min=0;
			while(s>=0){
				
				if(findAngle(h, min)==0){
					System.out.println(h+" : "+min);
					break;
				}
				
				s++;
				min++;
				
			}
			h++;
		}
		
		
	}

	
	public static void main(String[] args) {
		findAngle(1.00, 5.00);
		meetingPoint();
	}
}
