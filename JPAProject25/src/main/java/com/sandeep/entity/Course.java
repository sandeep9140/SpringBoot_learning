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

	private String name;
	
	private int fees;
	
	@ManyToMany
	@JoinTable(
			name = "mera_table",
			joinColumns =@JoinColumn(name = "cId"),
			inverseJoinColumns= @JoinColumn(name = "mera_name")
			)			
	private List<Student> std;
	
	
	
	public Course() {
		
	}


	public Course(String name, int fees) {
		super();
		this.name = name;
		this.fees = fees;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
