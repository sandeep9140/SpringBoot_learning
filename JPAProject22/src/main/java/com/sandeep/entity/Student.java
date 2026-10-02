package com.sandeep.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer fees;
	
	@OneToOne(mappedBy = "student")
	private Teacher teacher;
	
	public Student() {
		
	}

	public Student(String name, Integer fees) {
		super();
		this.name = name;
		this.fees = fees;
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

	public Integer getFees() {
		return fees;
	}

	public void setFees(Integer fees) {
		this.fees = fees;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
	
	
	

}
