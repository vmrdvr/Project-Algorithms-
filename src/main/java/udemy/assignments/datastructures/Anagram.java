package udemy.assignments.datastructures;

import java.util.Scanner;

public class Anagram {
private String s1;
private String s2;
	public Anagram(String s1, String s2){
		
		this.s1=s1;
		this.s2=s2;
	}
	
	public boolean checkForAnagram(){
		
		if(s1.length()==s2.length() && s1!="" && s2!=""){
			int count =0;
		for(int i=0;i<s1.length();i++){
				
				if(s2.contains(s1.substring(i, i+1))){
				
				}else{
					break;
				}
	count++;
	
			}
		if(count == s1.length())
			return true;
		}
		return false;
		
	}
public static void main(String[] args){
	 Scanner s= new Scanner(System.in);

     String string = s.nextLine();
     String reverseString = s.nextLine();
	Anagram anagram = new Anagram(string, reverseString);
	System.out.println(anagram.checkForAnagram());
	
}
	
}
