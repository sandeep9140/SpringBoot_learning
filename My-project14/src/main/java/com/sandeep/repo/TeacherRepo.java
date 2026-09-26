package com.sandeep.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sandeep.entities.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {

}
