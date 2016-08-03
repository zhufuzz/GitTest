package com.jikexueyuan.Course05_2;

import org.junit.Test;

public class RefTest {
@Test
public void testObj(){
	Object obj=new Object();
	System.out.println(obj);
	obj=new Object();
	System.out.println(obj);
}
public void changeString(String str){
	str="World";
}
public void changePerson(Person p){
	p=new Person("BBB");
}

@Test
public void testString(){
	String str="Hello";
	changeString(str);
	System.out.println(str);
}
@Test
public void testPerson(){
	Person p=new Person("AAA");
	changePerson(p);
	System.out.println(p.getName());
}

}
