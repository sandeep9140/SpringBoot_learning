package com.sandeep.serviceImp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.sandeep.entities.Student;
import com.sandeep.repo.StudentRepo;
import com.sandeep.service.StudentService;

@Service
public class StudentServiceImp  implements StudentService{

	@Autowired
	private StudentRepo repo;
	@Override
	public void saveStudents() {
		
		List<Student> list=Arrays.asList(
				new Student("Sandeep", 21),
				new Student("ankit", 20),
				new Student("vijay", 22),
				new Student("pradeep", 223),
				new Student("pooja", 24),
				new Student("lallu", 25),
				new Student("sukla", 23),
				new Student("dusman", 22),
				new Student("anku", 27),
				new Student("vinita", 22)
				);
		
		repo.saveAll(list);
		
	}
	
	
	@Override
	public void getStudent(Student std) {
		Example<Student> data=Example.of(std);
		
		List<Student> records=repo.findAll(data);
		
		records.forEach(d->System.out.println(d.getId()+" "+d.getName()+" "+d.getAge()));
		
	}
	
}
