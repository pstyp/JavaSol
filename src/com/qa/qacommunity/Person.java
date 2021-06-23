package com.qa.qacommunity;

public class Person {

	private String name;
	private int age;
	private double height;

	public Person(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public static void main(String[] args) {
     
		Person pawel = new Person("Pawel", 26, 511);
		
		pawel.greet();
	}

	public void greet() {
		System.out.println("Hi I'm " + name + " and I'm " + age + " years old. My height is " + height);
	}
}
