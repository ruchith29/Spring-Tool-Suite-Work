package com.studentapp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int student_Id;
	@Column
	private String student_Name;
	@Column
	private int student_Age;
	
	public Student() {
		
	}

	public int getStudent_Id() {
		return student_Id;
	}

	public void setStudent_Id(int student_Id) {
		this.student_Id = student_Id;
	}

	public String getStudent_Name() {
		return student_Name;
	}

	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}

	public int getStudent_Age() {
		return student_Age;
	}

	public void setStudent_Age(int student_Age) {
		this.student_Age = student_Age;
	}
	

}
