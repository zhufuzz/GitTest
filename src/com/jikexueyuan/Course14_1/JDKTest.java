package com.jikexueyuan.Course14_1;

import java.util.Arrays;

public class JDKTest {
	public static void main(String[] args) {
		int[] array = {1, 4, 5, 12, 14, 20, 33, 35, 67, 90, 95};
		System.out.println(Arrays.binarySearch(array, 1));
		System.out.println(Arrays.binarySearch(array, 95));
		System.out.println(Arrays.binarySearch(array, 12));
		System.out.println(Arrays.binarySearch(array, 13));
		System.out.println(Arrays.binarySearch(array, -5));
		System.out.println(Arrays.binarySearch(array, 100));
		System.out.println(Arrays.binarySearch(array, 4, 10, 67));
		System.out.println(Arrays.binarySearch(array, 2, 5, 67));
	}
}
