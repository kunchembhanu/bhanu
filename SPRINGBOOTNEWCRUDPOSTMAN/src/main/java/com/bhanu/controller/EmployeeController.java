package com.bhanu.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhanu.model.EmpDao;
import com.bhanu.model.Employees;
@RestController
public class EmployeeController {
	@SuppressWarnings("unused")
	@Autowired
	private EmpDao empDao;
	@GetMapping(path="/hai",produces ="application/json")
	
	public Employees getEmployees()
	{
	return EmpDao.getAllEmployees();	
	}
	

}



