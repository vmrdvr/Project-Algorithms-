package com.ravi.geeksforgeeks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PositionOfRobot {

	
	static List<Integer>  findPosition(String s){
	LinkedList<Integer> list = new LinkedList<Integer>();
	
		int len = s.length();
		List<Integer> position = new ArrayList<Integer>();
		int x=0;
		int y=0;
		int i=0;
		while(i < len){
			
			switch(s.charAt(i)){
				case 'U':
				y+=1;
				break;
				case 'D':
				y-=1;
				break;
				case 'L':
				x-=1;
				break;
				case 'R':
				x+=1;
				break;
			}
			i++;
		}
		position.add(x);
		position.add(y);
		
		return position;
	}
	public static void main(String[] args) {
		System.out.println(findPosition("UDDLLRUUUDUURUDDUULLDRRRR"));
	}
}
