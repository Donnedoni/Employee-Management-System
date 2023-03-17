package com.sjprogramming.springmysql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table
public class Employee {
	//auto generate employee ID(Primary key)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column
	private String Name;
	@Column
	private String Surname;
	@Column
	private String Email;
	
	//constructor
	public Employee(){}
	
	//Constructor
	public Employee(int id, String name, String surname, String email) {
		super();
		Id = id;
		Name = name;
		Surname = surname;
		Email = email;
	}

	//Getters and setters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
