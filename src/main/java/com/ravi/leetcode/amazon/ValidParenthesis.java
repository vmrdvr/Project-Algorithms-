package com.ravi.leetcode.amazon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

	static boolean isValid(String s) {

		if (s.length() == 0)
			return true;
		if (s.length() % 2 != 0)
			return false;

		Map<Character, Character> map = new HashMap<Character, Character>();

		map.put(')', '(');
		map.put('}', '{');
		map.put(']','[');

		Stack<Character> stack = new Stack<Character>();


		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{') {

				stack.push(s.charAt(i));
			} else {
				if (!stack.isEmpty()) {
					if (map.get(s.charAt(i)) == stack.peek()) {

						stack.pop();
					}
				}

			}

		}
		return stack.isEmpty();
	}
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	String st = s.next();
	System.out.println(isValid(st));
}
}
