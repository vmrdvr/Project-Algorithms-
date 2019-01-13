package com.expedia;

import java.util.ArrayList;
import java.util.List;

public class SampleTestOddBWRange {

	static List<Integer> oddNumbers(int l, int r) {
		List<Integer> list = new ArrayList<Integer>();
		if (l == r) {

			if (l % 2 != 0)
				list.add(l);

			return list;

		}
		for (int i = l; i <= r; i++) {

			if (i % 2 != 0)
				list.add(i);

		}

		return list;
	}
}
