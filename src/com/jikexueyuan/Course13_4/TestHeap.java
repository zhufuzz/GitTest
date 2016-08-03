package com.jikexueyuan.Course13_4;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestHeap {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(5);
		queue.offer(2);
		queue.offer(15);
		queue.offer(3);
		queue.offer(10);
		queue.offer(18);
		queue.offer(4);
		Iterator<Integer> it = queue.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----");
		while (!queue.isEmpty()) {
			System.out.println(queue.peek() + " " + queue.poll());
		}
	}
}
