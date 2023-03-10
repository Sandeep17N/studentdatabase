package com.jspiders;

public class Student {
	private static int count =1;
	private String id;
	private int age;
	private String name;
	private double marks;
	
	public Student(int age, String name, double marks) {
		super();
		this.id = "1AY19CV40"+count;
		this.age = age;
		this.name = name;
		this.marks = marks;
		count++;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", marks=" + marks + "]";
	}


}
