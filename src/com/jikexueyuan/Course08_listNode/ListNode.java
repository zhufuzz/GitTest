package com.jikexueyuan.Course08_listNode;

/**
 * 链表的节点类
 */
public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int val) {
		super();
		this.val = val;
	}
	public ListNode(int val, ListNode next) {
		super();
		this.val = val;
		this.next = next;
	}
	@Override
	public String toString() {
		return "ListNode [val=" + val + "]";
	}
	
	public static void printList(ListNode head){
		ListNode p=head;
		while(p!=null){
			System.out.print(p.val+" ");
			p=p.next;
		}
		System.out.println();
	}
	
	public static ListNode arrayToList(int[] array){
		ListNode head=new ListNode(0);
		ListNode p=head;
		for(int value:array){
			p.next=new ListNode(value);
			p=p.next;
		}
		return head.next;
	}
}
