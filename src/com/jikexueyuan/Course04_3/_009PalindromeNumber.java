package com.jikexueyuan.Course04_3;

import org.junit.Test;

public class _009PalindromeNumber {
/**
ȡ������x��λ��
 */
public int wei(int x){
	int count=0;
	while(x>0){
		x/=10;
		count++;
	}
	return count;
}
/**
����m��n�η�
 */
public int pow(int m,int n){
	int multy=1;
	for(int i=1;i<=n;i++){
		multy*=m;
	}
	return multy;
}
public boolean isPalindrome(int x) {
   if(x<0){
	   return false;
   }else if(x<10){
	   return true;
   }else{
	   int wei=wei(x);
	   int t=pow(10, wei-1);
	   int half=wei/2;
	   int n=x;
	   for(int i=0;i<half;i++){
		   if(x/t%10==n%10){
			   t/=10;
			   n/=10;
		   }else{
			   return false;
		   }
	   }
	   return true;
   }
}
@Test
public void test(){
	System.out.println(isPalindrome(1245421));
	System.out.println(isPalindrome(678876));
	System.out.println(isPalindrome(12342));
}
}
