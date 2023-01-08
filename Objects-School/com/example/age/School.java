package com.example.age;

public class School {
	public String studentName;
	public Integer classrooms;
	public Integer schoolyard;
	public Boolean hymns;
	public Student student;
	
		
	public void graduated() {
		if(this.student.graduated) {//the student class shares information about the attribute with the School class
			System.out.println("Eres minoria");
		} else {
			System.out.println("Racista asqueroso");
		}
		}
	}