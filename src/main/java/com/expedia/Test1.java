package com.expedia;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Test1 {


    public static void customSort(List<Integer> arr) {
   	
    }
	
	   static String findNumber(List<Integer> arr, int k) {
		   
		if (null == arr && arr.size() == 0)
			return "NO";

		Collections.sort(arr);
		System.out.println(Collections.binarySearch(arr, k));
		// if() return "NO";

		return "YES";

	    }
	   public static void main(String[] args) throws IOException {

	    }	
}
