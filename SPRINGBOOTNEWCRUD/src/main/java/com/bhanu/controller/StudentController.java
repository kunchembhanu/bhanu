package com.bhanu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhanu.model.Student;
import com.bhanu.repository.StudentRepoInter;
@Controller

public class StudentController {
	@Autowired
    StudentRepoInter studentRepository;

    
    @RequestMapping(value="/ping", method=RequestMethod.GET)
    @ResponseBody
    public String healthCheck() {
        return "This is working well";
    }


    @RequestMapping(value="/students", method=RequestMethod.GET)
    @ResponseBody
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @RequestMapping(value="/student", method=RequestMethod.POST)
    @ResponseBody
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @RequestMapping(value="/findstudent", method = RequestMethod.GET)
    @ResponseBody
    public Student findStudent(@RequestParam("studentId") int studentId) {
        return studentRepository.findById(studentId);
    }

    @RequestMapping(value= "/updatestudent", method = RequestMethod.GET)
    @ResponseBody
    public Student updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @RequestMapping(value="/deletestudent", method = RequestMethod.GET)
    @ResponseBody
    public int deleteStudent(@RequestParam("studentId") int studentId) {
        return studentRepository.deleteById(studentId);
    }
}





