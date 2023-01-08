package com.example.age;

public class Student {
	public String name;
	public String id;
	public Integer group;
	public Double grade;
	public Boolean graduated;
	
	Student(){//Constructor for the student Object, by default
		
	}

	
	Student (String name){
		this.name=name;
	}
	
	Student (String nombre, Boolean graduated){
		this.name=nombre;
		this.graduated=graduated;
	}
	public void isGraduated() {//a Method from the student class, doesn't send or return anything 
		if(this.graduated) {
			System.out.println("Congratulations!");
		}
		
		else {
		System.out.println("You need to keep studying");
		}
		}
		
	}
