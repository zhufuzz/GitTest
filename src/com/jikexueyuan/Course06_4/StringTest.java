package com.jikexueyuan.Course06_4;

import org.junit.Test;

public class StringTest {
@Test
public void test(){
	String s="ffabcdabceeabcdabaggabcdabahh";
	String p="abcdaba";
	System.out.println(s.indexOf(p));
	s="aabbccagdbbccdec";
	System.out.println(s.indexOf(p));
}
}
