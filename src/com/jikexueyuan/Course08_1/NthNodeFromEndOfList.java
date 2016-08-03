package com.jikexueyuan.Course08_1;

import org.junit.Test;

import com.jikexueyuan.Course08_listNode.ListNode;

/**
 * 寻找链表的�?数第N个节�?
 */
public class NthNodeFromEndOfList {
	/**
	 *取得链表的长�?
	 */
	public int lengthOfList(ListNode head) {
		int m = 0;
		ListNode p = head;
		while (p != null) {
			m++;
			p = p.next;
		}
		return m;
	}
	/**
	 * 方法1
	 */
	public ListNode find01(ListNode head, int n) {
		if (head == null) {
			return head;
		} else {
			int m = lengthOfList(head);
			ListNode p = head;
			for (int i = 1; i <= m - n; i++) {
				p = p.next;
			}
			return p;
		}
	}
	/**
	 * 方法2，双指针，遍历一�?
	 */
	public ListNode find02(ListNode head, int n) {
		if (head == null) {
			return head;
		} else {
			ListNode p1 = head;
			ListNode p2 = head;
			for (int i = 1; i <= n; i++) {
				p2 = p2.next;
			}
			while (p2 != null) {
				p2 = p2.next;
				p1 = p1.next;
			}
			return p1;
		}
	}
	@Test
	public void test01() {
		int[] array = {1, 2, 3, 4, 5, 6};
		ListNode head = ListNode.arrayToList(array);
		System.out.println(find01(head, 4));
	}
	@Test
	public void test02() {
		int[] array = {1, 2, 3, 4, 5, 6};
		ListNode head = ListNode.arrayToList(array);
		System.out.println(find02(head, 4));
	}
}
