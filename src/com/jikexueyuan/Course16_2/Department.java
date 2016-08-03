package com.jikexueyuan.Course16_2;

/**
 * 部门
 */
public class Department {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public Department(int id) {
	super();
	this.id = id;
}

@Override
public String toString() {
	return "Department [id=" + id + "]";
}

}
