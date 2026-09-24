package com.sandeep.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Manager {
	
	@Id
	private int id;
	private String Mname;
	
	public Manager() {
		
	}
	public Manager(int id, String mname) {
		super();
		this.id = id;
		Mname = mname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMname() {
		return Mname;
	}
	public void setMname(String mname) {
		Mname = mname;
	}
	

}
