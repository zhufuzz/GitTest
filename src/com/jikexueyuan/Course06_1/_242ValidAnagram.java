package com.jikexueyuan.Course06_1;

import org.junit.Test;

/**
英语单词�?同分异构�?
 */
public class _242ValidAnagram {
	 public boolean isAnagram(String s, String t) {
	        if(s==null&&t==null){
	        	return true;
	        }else if(s==null&&t!=null){
	        	return false;
	        }else if(s!=null&&t==null){
	        	return false;
	        }else{
	        	if(s.length()!=t.length()){
	        		return false;
	        	}
	        	int n=s.length();
	        	int twentySix=26;
	        	int[] sTable=new int[twentySix];
	        	int[] tTable=new int[twentySix];
	        	for(int i=0;i<n;i++){
	        		sTable[s.charAt(i)-'a']++;
	        		tTable[t.charAt(i)-'a']++;
	        	}
	        	for(int i=0;i<twentySix;i++){
	        		if(sTable[i]!=tTable[i]){
	        			return false;
	        		}
	        	}
	        	return true;
	        }
	    }
	 @Test
	 public void test(){
		 System.out.println(isAnagram("anagram", "nagaram"));
		 System.out.println(isAnagram("rat", "car"));
	 }
}
