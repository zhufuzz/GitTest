package com.jikexueyuan.Course05_2;

import org.junit.Test;

public class ChangeTest {
public void changePerson(Person p){
	p.setName("BBB");
}
public void changeString01(String str){
	str.replaceAll("Hello", "World");
}
public String changeString02(String str){
	str=str.replaceAll("Hello", "World");
	return str;
}
@Test
public void testPerson(){
	Person p=new Person("AAA");
	changePerson(p);
	System.out.println(p.getName());
}
@Test
public void testStr01(){
	String str="Hello";
	changeString01(str);
	System.out.println(str);
}
@Test
public void testStr02(){
	String str="Hello";
	str=changeString02(str);
	System.out.println(str);
}
}
