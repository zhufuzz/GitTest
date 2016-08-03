package com.jikexueyuan.Course12_4;

import org.junit.Test;

public class _263UglyNumber{
	  public boolean isUgly(int num) {
	      int n=num;
	      if(n<=0){
	    	  return false;
	      }
	      if(n==1){
	    	  return true;
	      }
	      while(n%2==0){
	    	  n/=2;
	      }
	      while(n%3==0){
	    	  n/=3;
	      }
	      while(n%5==0){
	    	  n/=5;
	      }
	      if(n==1){
	    	  return true;
	      }else{
	    	  return false;
	      }
	  }
	  @Test
	  public void test(){
		  System.out.println(isUgly(180));
		  System.out.println(isUgly(42));
	  }
}
