package com.bhanu.repository;





import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhanu.model.Student;




public interface StudentRepoInter extends JpaRepository<Student, Integer> {

		List<Student> findAll();
		Student findById(int id);
		int deleteById(int id);


		}

		

