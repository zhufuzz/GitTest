package com.jikexueyuan.Course13_2;

import java.util.LinkedList;

public class TestRemove {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list.removeFirst());
		System.out.println(list.removeLast());
		System.out.println(list);
	}
}
