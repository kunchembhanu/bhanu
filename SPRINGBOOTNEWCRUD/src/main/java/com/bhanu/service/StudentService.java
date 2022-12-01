package com.bhanu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhanu.model.Student;
import com.bhanu.repository.StudentRepoInter;
@Service
@Transactional

public class StudentService {
	@Autowired
    StudentRepoInter studentRepository;

    //Get all the students
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    //display one student by id
    public Student getStudentById(int id) {
        return studentRepository.findById(id);
    }

    //save student in database
    public void saveStudent(Student student) {
        try{
            studentRepository.save(student);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    //delete stuednt by id
    public void deleteStudent(int id) {
        try{
            studentRepository.deleteById(id);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}





