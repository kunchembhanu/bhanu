package com.bhanu.spring;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController
{
	 @Autowired
	   private EmployeeService employeeDao;
	       
	        // Implementing a GET method
	        // to get the list of all
	        // the employees
	   @GetMapping(
	        path = "/",
	        produces = "application/json")
	  
	    public Employees getEmployees()
	    {
	  
	        return employeeDao
	            .getAllEmployees();
	    }
	  
	       
	        // Create a POST method
	        // to add an employee
	        // to the list
	   @PostMapping(
	        path = "/",
	        consumes = "application/json",
	        produces = "application/json")
	  
	    public ResponseEntity<Object> addEmployee(
	        @RequestBody Employee employee)
	    {
	  
	        // Creating an ID of an employee
	        // from the number of employees
	        Integer id
	            = employeeDao
	                  .getAllEmployees()
	                  .getEmployeeList()
	                  .size()
	              + 1;
	  
	        employee.setId(id);
	  
	        employeeDao
	            .addEmployee(employee);
	  
	        URI location
	            = ServletUriComponentsBuilder
	                  .fromCurrentRequest()
	                  .path("/{id}")
	                  .buildAndExpand(
	                      employee.getId())
	                  .toUri();
	  
	               return ResponseEntity
	            .created(location)
	            .build();
	    }
	   @DeleteMapping(
		        path = "/",
		        consumes = "application/json",
		        produces = "application/json")
		  
		    public ResponseEntity<Object> deleteEmployee(
		        @RequestBody Employee employee)
		    {
		  
		        // Creating an ID of an employee
		        // from the number of employees
		        Integer id
		            = employeeDao
		                  .getAllEmployees()
		                  .getEmployeeList()
		                  .size()
		              + 1;
		  
		        employee.setId(id);
		  
		        employeeDao
		            .addEmployee(employee);
		  
		        URI location
		            = ServletUriComponentsBuilder
		                  .fromCurrentRequest()
		                  .path("/{id}")
		                  .buildAndExpand(
		                      employee.getId())
		                  .toUri();
		  
		               return ResponseEntity
		            .created(location)
		            .build();
		    }
	   @PutMapping(
		        path = "/",
		        consumes = "application/json",
		        produces = "application/json")
		  
		    public ResponseEntity<Object> updateEmployee(
		        @RequestBody Employee employee)
		    {
		  
		        // Creating an ID of an employee
		        // from the number of employees
		        Integer id
		            = employeeDao
		                  .getAllEmployees()
		                  .getEmployeeList()
		                  .size()
		              + 1;
		  
		        employee.setId(id);
		  
		        employeeDao
		            .addEmployee(employee);
		  
		        URI location
		            = ServletUriComponentsBuilder
		                  .fromCurrentRequest()
		                  .path("/{id}")
		                  .buildAndExpand(
		                      employee.getId())
		                  .toUri();
		  
		               return ResponseEntity
		            .created(location)
		            .build();
		    }}


