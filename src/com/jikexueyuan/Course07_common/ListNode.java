package com.jikexueyuan.Course07_common;

/**
 * ้พ่กจ่็น
 */
public class ListNode<T> {
/**
 * ๅ?
 */
public T value;
/**
 * ๆๅไธไธไธช่็น็ๆ้(ๅผ็จ)
 */
public ListNode<T> next;
public ListNode(T value, ListNode<T> next) {
	super();
	this.value = value;
	this.next = next;
}
public ListNode() {
	super();
}
/**
 * ๆๅๅ่ถ่็น็ๆ้๏ผ็จไบๅ้พ่ก?
 */
public ListNode<T> pre;
}
