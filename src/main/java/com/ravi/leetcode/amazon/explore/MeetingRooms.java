package com.ravi.leetcode.amazon.explore;

public class MeetingRooms {

public static int minMeetingRooms(Interval[] intervals) {
				
		if(intervals.length==0) return 0;
		int i=0;
		int start=0;
		int end =0;
		int count =1;
				
			while(i<intervals.length){	 
				 start= intervals[i].start;
				 end = intervals[i].end;
				 for(int j=i+1;j<intervals.length;j++){
					 
					 if((intervals[j].start<end && intervals[j].start>start) || (intervals[j].end<end && intervals[j].end>start)){
						 count++;
						 break;
					 }
					 
				 }
			i++;
			}
	
	return count;
    }
	public static void main(String[] args) {
		Interval i = new Interval(0, 30);
		Interval i2 = new Interval(5, 10);
		Interval i3 = new Interval(15,20);

		
		Interval[] arr = {i,i2,i3};
		System.out.println(minMeetingRooms(arr));
	}
}
class Interval {
	      int start;
	      int end;
	      Interval() {
	    	  start = 0; end = 0; 
	     }
	      Interval(int s, int e) {
	    	  start = s; end = e; 
	     }
	  }