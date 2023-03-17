package com.sjprogramming.springmysql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeUpdate update;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee emp)
	{
		return update.CreateEmp(emp);
	}
	public List<Employee> GetAllEmps()
	{
		return update.GetAllEmp();
	}
	public Employee getEmployeebyID(int id)
	{
		return update.getEmp(id);
	}
	public Employee EditEmployee(Employee emp, int id)
	{
		return update.EditEmp(emp, id);
	}
	@DeleteMapping
	public ResponseEntity<String> deleteEmployee(int id)
	{
		return new ResponseEntity<String>("Deleted successfully", HttpStatus.OK);
	}

}
