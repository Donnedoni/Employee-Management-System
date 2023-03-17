package com.sjprogramming.springmysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//Implements the update interface
public class EmployeeUpdatesImpl implements EmployeeUpdate{
	@Autowired
	EmployeeRepository repo;
	//Implementation of the create method
	public Employee CreateEmp(Employee emp) {
		return repo.save(emp);
	}
	
	//Implementation of the Edit method
	public Employee EditEmp(Employee emp, int id) {
		Employee oldEmp = repo.findById(id).orElse(null);
		oldEmp.setId(id);
		oldEmp.setName(emp.getName());
		oldEmp.setSurname(emp.getSurname());
		oldEmp.setEmail(emp.getEmail());
		repo.save(oldEmp);
		return oldEmp;
	}
	
	//Implementation of the delete method
	public void DeleteEmp(int id) {
		repo.deleteById(id);
	}
	
	//Implementation of the find all method
	public List<Employee> GetAllEmp() {
		return repo.findAll();
	}
	
	//Implementation of the individual employee method
	public Employee getEmp(int id) {
		//Depricated method need to find alternative for getById 
		return repo.getById(id);
	}
}
