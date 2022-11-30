package com.example.demo1.Entity;

import java.sql.Date;

import javax.validation.constraints.Max;

public class Customer {
	@Max(value=1)
private Long id;
	@Max(value=3)
	private String name;
	
	private String location;
	
	private Date dateOfBirth;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	public Customer(String name, String location, Date dateOfBirth) {
		super();
		this.name = name;
		this.location = location;
		this.dateOfBirth = dateOfBirth;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
