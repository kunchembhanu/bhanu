package com.bhanu.model;

public class Employee {
	private Integer  id;
	private String Name;
	private String city;
	public Employee()
	{
		
	}
	public Employee(Integer id,String name,String city)
	{
		this.id=id;
		this.Name=name;
		this.city=city;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + Name + ", city=" + city + "]";
	}
	
}



