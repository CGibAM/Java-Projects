package com.exercises.archives;

public class Employee {
	public Integer id;
	public String name;
	public Integer age;
	public boolean greatPerformance;

	public Employee(Integer id, String name, Integer edad, boolean greatPerformace) {
		this.id = id;
		this.name = name;
		this.age = edad;
		this.greatPerformance = greatPerformace;
	}

	public void print() {
		System.out.println("Employee = " + this.name + " Age: " + this.age + " Negro: " + this.greatPerformance);
	}

}
