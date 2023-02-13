package com.bhanu.spring;
import org.springframework.stereotype.Repository;

import com.bhanu.spring.Employees;

@Repository
public class EmployeeService {
	
	private static Employees list
    = new Employees();

static
{
 list.getEmployeeList().add(new Employee(1,"Hai","Hello","Hello@gmail.com"));

list.getEmployeeList().add(new Employee(2, "abc","cde",  "abc@gmail.com"));

 list.getEmployeeList().add(new Employee(3, "xyz","zyx", "xyz@gmail.com"));
       
}

public Employees getAllEmployees()
{

    return list;
}
   
    public void
    addEmployee(Employee employee)
{
    list.getEmployeeList()
        .add(employee);
       
}
}

