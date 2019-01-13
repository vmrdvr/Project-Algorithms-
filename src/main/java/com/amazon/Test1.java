package com.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test1 {
	
	
    public List<Integer> cellCompete(int[] states, int days)
    {
    	int []newState = new int[states.length];
    	for(int i=0;i<days;i++) {
    		for(int j=0;j<states.length;j++) {
    			if(j > 0 && j < states.length-1){
    				if(states[j-1] == states[j+1]) {
    					newState[j] = 0;
    				} else {
    					newState[j] = 1;
    				}
    			} else if(j==0) {
    				if(states[j+1] == 1) {
    					newState[j] = 1;
    				} else {
    					newState[j] = 0;
    				}
    			} else {
    				if(states[j-1] == 1) {
    					newState[j] = 1;
    				} else {
    					newState[j] = 0;
    				}
    			}
    		}
    		copy(states,newState);
    	}
    	CopyOnWriteArrayList <Integer> list = new CopyOnWriteArrayList<Integer>();
    	for(int h : states) {
    		list.add(h);
    	}
    	return list;
    }
    
    private void copy(int[] st1, int[] st2) {
    	for(int i = 0;i<st1.length;i++) {
    		st1[i] = st2[i];
    	}
    }

}
