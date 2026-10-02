package com.sandeep.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	private String course_name;
	
	private int fees;
	
	@ManyToMany(mappedBy = "course")
	private List<Student> std;
	
	
	public Course() {
		
	}

	public Course(String course_name, int fees) {
		super();
		this.course_name = course_name;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public List<Student> getStd() {
		return std;
	}

	public void setStd(List<Student> std) {
		this.std = std;
	}
	
	
	

	
	
	
	
	

}
