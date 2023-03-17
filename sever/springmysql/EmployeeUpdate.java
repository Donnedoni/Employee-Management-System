package com.sjprogramming.springmysql;

import java.util.List;

import org.springframework.stereotype.Service;

@Service

public interface EmployeeUpdate {
	//Method to create employee
	public Employee CreateEmp(Employee emp);
	
	//Method to Edit employee
	public Employee EditEmp(Employee emp, int id);
	
	//Method to delete employee
	public void DeleteEmp(int id);
	
	//Method get employee
	public List<Employee> GetAllEmp();
	
	//Method to find employee by id
	public Employee getEmp(int id);
}
