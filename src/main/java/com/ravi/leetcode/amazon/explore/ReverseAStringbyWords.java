package com.ravi.leetcode.amazon.explore;

public class ReverseAStringbyWords {

	public static void reverseWords(char[] str) {

		if (str.length == 0)
			return;
		str = reverse(str, 0, str.length - 1);
		int start = 0;
		for (int i = 0; i < str.length; i++) {

			if (str[i] == ' ') {
				reverse(str, start, i - 1);
				start = i + 1;
			}

		}
		
		reverse(str, start, str.length-1);

	}

	static char[] reverse(char[] c, int start, int end) {

		while (start < end) {
			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;

		}
		return c;
	}

	public static void main(String[] args) {
		char[] c = { 't', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e' };
		reverseWords(c);
	}
}
