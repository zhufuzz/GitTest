package com.jikexueyuan.Course13_2;

import java.util.LinkedList;
import java.util.ListIterator;
public class TestIterator {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		ListIterator<Integer> it = list.listIterator(0);
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}