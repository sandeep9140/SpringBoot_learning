package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
