package com.sandeep.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	
	private String Emp_name;
	
	private int salery;
	
	
	public Employee() {
		
	}

	public Employee(String emp_name, int salery) {
		super();
		Emp_name = emp_name;
		this.salery = salery;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmp_name() {
		return Emp_name;
	}

	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}

	public int getSalery() {
		return salery;
	}

	public void setSalery(int salery) {
		this.salery = salery;
	}
	
	
	
	

}
