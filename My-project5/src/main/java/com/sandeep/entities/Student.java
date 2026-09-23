package com.sandeep.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name=" school")
public class Student {
	
	@Id
	private int id;
	private String name;
	private int age;
	
	
	
	//default constructor 
	public Student() {
		
	}
	
	
	//parameterized constructor 
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	//getter for ID
	public int getId() {
		return id;
	}
	
	//setter for ID
	public void setId(int id) {
		this.id = id;
	}
	
	//getter for Name 
	public String getName() {
		return name;
	}
	
	//setter for name 
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for age
	public int getAge() {
		return age;
	}
	
	//setter for age
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
