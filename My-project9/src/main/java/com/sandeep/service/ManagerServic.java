package com.sandeep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Manager;
import com.sandeep.repo.ManagerRepo;

@Service
public class ManagerServic {
	
	@Autowired
	private ManagerRepo repo;
	
	public void addManager(Manager manager) {
		repo.save(manager);
	}

}
