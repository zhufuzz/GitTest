package com.jikexueyuan.Course16_1;

/**
 * 汉诺塔
 */
public class HanoiTower {
public static void hanoi(String start,String mid,String end,int n){
	if(n==1){
		System.out.println(start+" "+end);
	}else{
		hanoi(start, end, mid, n-1);
		System.out.println(start+" "+end);
		hanoi(mid, start, end, n-1);
	}
}
public static void main(String[] args) {
	hanoi("A", "B", "C", 10);
}
}
