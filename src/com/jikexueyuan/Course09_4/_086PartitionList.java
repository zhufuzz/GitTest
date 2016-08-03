package com.jikexueyuan.Course09_4;

import org.junit.Test;

import com.jikexueyuan.Course09_common.ListNode;

/**
链表划分
 */
public class _086PartitionList {
	  public ListNode partition(ListNode head, int x) {
	        if(head==null||head.next==null){
	        	return head;
	        }
	        ListNode leftHead=new ListNode(0);
	        ListNode leftTail=leftHead;
	        ListNode rightHead=new ListNode(0);
	        ListNode rightTail=rightHead;
	        ListNode p=head;
	        while(p!=null){
	        	if(p.val<x){
	        		leftTail.next=p;
	        		leftTail=p;
	        	}else{
	        		rightTail.next=p;
	        		rightTail=p;
	        	}
	        	p=p.next;
	        }
	        p=leftTail;
	        p.next=rightHead.next;
	        rightTail.next=null;
	        return leftHead.next;
	    }
	  @Test
	  public void test(){
		  int[] array={1,4,3,2,5,2};
		  int x=3;
		  ListNode head=ListNode.arrayToList(array);
		  head=partition(head, x);
		  ListNode.printList(head);
	  }
}
