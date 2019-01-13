package com.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Test3 {
	
	List<List<Integer>> ClosestXdestinations(int numDestinations, 
            List<List<Integer>> allLocations,
            int numDeliveries)
	{
		TreeMap<Long,List<List<Integer>>> map = new TreeMap();
		List<Integer> cords = null;
		List<List<Integer>> crdsMap = null;
		for(int i=0;i<numDestinations;i++) {
			cords = allLocations.get(i);
			long dist = ((long)cords.get(0))*((long)cords.get(1));
			crdsMap = map.get(dist);
			if(crdsMap == null) {
				crdsMap = new ArrayList<List<Integer>>();
				map.put(dist, crdsMap);
			}
			crdsMap.add(cords);
		}
		List<List<Integer>> destList = new ArrayList<List<Integer>>();
		for(Entry<Long,List<List<Integer>>> entr: map.entrySet()) {
			crdsMap = entr.getValue();
			for(List<Integer> lks : crdsMap) {
				destList.add(lks);
				if(destList.size() == numDestinations) {
					break;
				}
			}
			if(destList.size() == numDestinations) {
				break;
			}
		}
		return destList;
	}

}
