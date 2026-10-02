package com.sandeep.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Character grade;
	
	@OneToOne
	@JoinColumn(name = "Student_id_ka_name_ka_id")
	private Student studentData;
	
	
	public Student getStudentData() {
		return studentData;
	}

	public void setStudentData(Student studentData) {
		this.studentData = studentData;
	}

	public Teacher() {
		
	}

	public Teacher(String name, Character grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}
	
	

}
