package com.jikexueyuan.Course03_1;

import java.util.Random;

import org.junit.Test;

public class TestInverse {
/**
 * 测试对象数组的�?�?
 */
@Test
public void testPerson(){
	Person[] array=new Person[6];
	for(int i=0;i<6;i++){
		array[i]=new Person(i, "name"+i);
	}
	InverseArray<Person> ia=new InverseArray<Person>();
	ia.printArray(array);
	ia.inverse(array);
	ia.printArray(array);
}
/**
 * 测试整型数组的�?�?
 */
@Test
public void testInteger(){
	Integer[] array=new Integer[7];
	Random ra=new Random();
	for(int i=0;i<7;i++){
		array[i]=ra.nextInt(10);
	}
	InverseArray<Integer> ia=new InverseArray<Integer>();
	ia.printArray(array);
	ia.inverse(array);
	ia.printArray(array);
}
}
