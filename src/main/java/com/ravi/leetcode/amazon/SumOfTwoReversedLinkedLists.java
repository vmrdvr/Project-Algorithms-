package com.ravi.leetcode.amazon;

public class SumOfTwoReversedLinkedLists {
	ListNode head;

	static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		if (l1 == null && l1 == null)
			return null;
		int l1temp = 0;
		int l2temp = 0;
		while (l1 != null) {

			l1temp = l1temp * 10 + l1.val;
			l1 = l1.next;

		}
		while (l2 != null) {
			l2temp = l2temp * 10 + l2.val;
			l2 = l2.next;
		}
		int var1 = 0;
		while (l1temp != 0) {

			var1 = var1 * 10 + l1temp % 10;
			l1temp = l1temp / 10;
		}
		int var2 = 0;
		while (l2temp != 0) {

			var2 = var2 * 10 + l2temp % 10;
			l2temp = l2temp / 10;
		}

		int result = var1 + var2;

		ListNode res = null;
		if (result == 0)
			return new ListNode(0);
		while (result != 0) {

			int i = result % 10;

			if (res == null) {
				res = new ListNode(i);
			} else {
				ListNode temp = res;
				while (res.next != null) {

					res = res.next;

				}
				res.next = new ListNode(i);
				res = temp;
			}

			result = result / 10;

		}

		return res;
	}

	public static void main(String[] args) {

		SumOfTwoReversedLinkedLists s = new SumOfTwoReversedLinkedLists();
		s.head = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		s.head.next = n2;
		n2.next = n3;
		n3.next = null;
		SumOfTwoReversedLinkedLists s2 = new SumOfTwoReversedLinkedLists();
		s2.head = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		s2.head.next = n5;
		n5.next = n6;
		n6.next = null;

		addTwoNumbers(s.head, s2.head);
	}
}
