package com.sandeep.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(
			name = "employees_name",
			nullable = false,
			length = 100
			)
	private String name;
	

	@Column(
			nullable = false,
			length = 100
			)
	private String email;
	

	@Column(
			name = "employee_name",
			nullable = false,
			length = 50
			)
	private String department;
	

	@Column(	
			nullable = false
			)
	private double sallery;
	

	@Column(	
			nullable = false
			)
	private String designation;
	
	
	@CreationTimestamp
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
	
	
	
	
	public Employee() {
		
	}
	public Employee(String name, String email, String department, double sallery, String designation) {
		super();
		this.name = name;
		this.email = email;
		this.department = department;
		this.sallery = sallery;
		this.designation = designation;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSallery() {
		return sallery;
	}
	public void setSallery(double sallery) {
		this.sallery = sallery;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
	
	
	

}
