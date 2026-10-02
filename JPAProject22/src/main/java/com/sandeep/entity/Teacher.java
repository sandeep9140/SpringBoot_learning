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
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	private Integer marks;
	
	@OneToOne
	//@JoinColumn(name="std_id")
	private Student student;
	
	
	public Teacher() {
		
	}
	

	public Teacher(String name, Integer marks) {
		super();
		this.name = name;
		this.marks = marks;
	
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

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	

}
