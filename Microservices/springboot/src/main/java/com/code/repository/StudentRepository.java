package com.code.repository;

 
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.code.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	 Student findByName(String name);
}
