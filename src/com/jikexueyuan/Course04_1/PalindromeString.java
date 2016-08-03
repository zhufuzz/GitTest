package com.jikexueyuan.Course04_1;

import org.junit.Test;

/**
 *ÅĞ¶Ï×Ö·û´®ÊÇ·ñ»ØÎÄ
 */
public class PalindromeString {
public boolean isPalindrome(String str){
	if(str==null||str.length()<=1){
		return true;
	}
	for(int i=0,j=str.length()-1;i<j;i++,j--){
		if(str.charAt(i)!=str.charAt(j)){
			return false;
		}
	}
	return true;
}
@Test
public void test(){
	System.out.println(isPalindrome("abcdcba"));
	System.out.println(isPalindrome("abcdeba"));
	System.out.println(isPalindrome("abccba"));
	System.out.println(isPalindrome("abcd"));
	System.out.println(isPalindrome("Çï½­³şÑãËŞÉ³ÖŞ ÑãËŞÉ³ÖŞÇ³Ë®Á÷ Á÷Ë®Ç³ÖŞÉ³ËŞÑã ÖŞÉ³ËŞÑã³ş½­Çï"));
}
}
