package com.example.demo1.DAO;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo1.Entity.Customer;
@Component
public interface CustomerrDAO {
	public List<Customer> findAll();

	public int save(Customer d);

	public int update(Customer c);

	public int delete(Customer r);

	public Customer findbyId(int id);
	

}
