package com.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test4 {
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public static void main(String[] args) {
		List<App> bappList = new ArrayList<App>();
		for(int i=0;i<10;i++) {
			App app = new App();
			app.id = i;
			app.mem = 20-i;
			bappList.add(app);
		}
		Collections.sort(bappList);
		for(App app : bappList) {
			System.out.println(app);
		}
	}

 List<List<Integer>> optimalUtilization(
			int deviceCapacity, 
			List<List<Integer>> foregroundAppList,
			List<List<Integer>> backgroundAppList)
	{
		List<App> bappList = new ArrayList<App>();
		for(List<Integer> lst : backgroundAppList) {
			App app  = new App();
			app.id = lst.get(0);
			app.mem = lst.get(1);
			bappList.add(app);
		}
		Collections.sort(bappList);
		List<App> maxList = new ArrayList<App>();
		int max = 0;
		for(List<Integer> lst : foregroundAppList) {
			App fApp = new App();
			fApp.id = lst.get(0);
			fApp.mem = lst.get(1);
			int index = 0;
			if(max!= 0) {
				index = indexB(bappList, max-fApp.mem);
			} 
			if(index > 0) {
				for(int i=index;i<bappList.size();i++) {
					App bApp = bappList.get(i);
					if(bApp.mem+fApp.mem <= deviceCapacity) {
						if(bApp.mem+fApp.mem >= max) {
							if(bApp.mem+fApp.mem > max) {
								maxList.clear();
								max = bApp.mem+fApp.mem;
							}
							maxList.add(fApp);
							maxList.add(bApp);
						}
					} else {
						break;
					}
				}
			}
		}
		List<List<Integer>> finalAppIds = new ArrayList<List<Integer>>();
		List<Integer> appIds = null;
		for(int i=0;i<maxList.size();i+=2) {
			appIds = new ArrayList<Integer>();
			appIds.add(maxList.get(i).id);
			appIds.add(maxList.get(i+1).id);
			finalAppIds.add(appIds);
		}
		return finalAppIds;
	}
	
	int indexB(List<App> bappList, int mem) {
		int start = 0, mid, end = bappList.size()-1;
		mid = (start + end)/2;
		while(start != mid) {
			if(bappList.get(mid).mem == mem) {
				return mid;
			} else{
				if(bappList.get(mid).mem > mem) {
					end = mid+1;
				} else {
					start = mid;
				}
				mid = (start+end)/2;
			}
		}
		return -1;
	}

	List<List<Integer>> optimalUtilization1(
			int deviceCapacity, 
			List<List<Integer>> foregroundAppList,
			List<List<Integer>> backgroundAppList)
	{
		List<App> bappList = new ArrayList<App>();
		for(List<Integer> lst : backgroundAppList) {
			App app  = new App();
			app.id = lst.get(0);
			app.mem = lst.get(1);
			bappList.add(app);
		}
		Collections.sort(bappList);
		List<App> maxList = new ArrayList<App>();
		int max = 0;
		for(List<Integer> lst : foregroundAppList) {
			App fApp = new App();
			fApp.id = lst.get(0);
			fApp.mem = lst.get(1);
			for(App bApp : bappList) {
				if(bApp.mem+fApp.mem <= deviceCapacity) {
					if(bApp.mem+fApp.mem >= max) {
						if(bApp.mem+fApp.mem > max) {
							maxList.clear();
							max = bApp.mem+fApp.mem;
						}
						maxList.add(fApp);
						maxList.add(bApp);
					}
				} else {
					break;
				}
			}
		}
		List<List<Integer>> finalAppIds = new ArrayList<List<Integer>>();
		List<Integer> appIds = null;
		for(int i=0;i<maxList.size();i+=2) {
			appIds = new ArrayList<Integer>();
			appIds.add(maxList.get(i).id);
			appIds.add(maxList.get(i+1).id);
			finalAppIds.add(appIds);
		}
		return finalAppIds;
	}
	// METHOD SIGNATURE ENDS

    
    
    // METHOD SIGNATURE ENDS

}

class App implements Comparable<App>{
	int id,mem;

	public int compareTo(App o) {
		return this.mem - o.mem;
	}

	@Override
	public String toString() {
		return "App [id=" + id + ", mem=" + mem + "]";
	}
	
	
}
