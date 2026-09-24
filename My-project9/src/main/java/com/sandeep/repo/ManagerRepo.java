package com.sandeep.repo;

import org.springframework.data.repository.CrudRepository;

import com.sandeep.entities.Manager;

public interface ManagerRepo extends CrudRepository<Manager, Integer> {

}
