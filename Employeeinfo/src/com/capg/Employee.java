package com.capg;

public class Employee {

private  String name;
private int id;
private float sal;
public Employee(String name, int id, float sal) {
	super();
	this.name = name;
	this.id = id;
	this.sal = sal;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", sal=" + sal + "]";
}


	}


