package com.bhanu.model;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository


public class EmpDao {
private static Employees ListEmp = new Employees();
	
	static 
	{
		ListEmp.getEmpList().add(new Employee(1,"user1","city1"));
		ListEmp.getEmpList().add(new Employee(2,"user2","city2"));
		ListEmp.getEmpList().add(new Employee(3,"user3","city3"));
		ListEmp.getEmpList().add(new Employee(4,"user4","city4"));
	}
	public static Employees getAllEmployees()
	{
		return ListEmp;
	}
	public void  addEmployee(Employee emp)
	{
	ListEmp.getEmpList().add(emp);	
	}
public String updateEmployee(Employee emp)
{
	for(int i=0;i<ListEmp.getEmpList().size();i++)
	{
		Employee obj =ListEmp.getEmpList().get(i);
		if(obj.getId().equals(emp.getId()))
		{
			ListEmp.getEmpList().set(i, emp);
			System.out.println("one record update");
			return "updated successfully.";
		}
	}
	return "given id is not available.";
}
}



