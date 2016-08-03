package com.jikexueyuan.Course02;
/**
 * 递归调用构�?函数，并捕获异常
 */
public class SumExceptionConstructor {
public static int n;
public static int[] array;

public SumExceptionConstructor(int i){
	try {
		array[i]=array[i-1]+i;
		new SumExceptionConstructor(i+1);
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(array[n]);
		return;
	}
}
}
