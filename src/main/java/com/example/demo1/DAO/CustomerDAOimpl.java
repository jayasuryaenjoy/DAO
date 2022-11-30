package com.example.demo1.DAO;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo1.Entity.Customer;
@Repository
public class CustomerDAOimpl implements CustomerrDAO {
	final String INSERT_QUERY = "insert into  Customer(id,name,location,dateOfBirth) values (?,?,?,?)";
	final String UPDATE_QUERY = "update Customer set name = ? ,dateOfBirth=? ,location=? where id = ?";
	final String DELETE_QUERY = "delete from Customer where id = ?";
	final String SELECT_QUERY = "select * from Customer where id=?";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public List<Customer> findAll() {
		return jdbcTemplate.query("select * from Customer", new BeanPropertyRowMapper<Customer>(Customer.class));
	}	
	
	@Override
	public int save(Customer d) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(INSERT_QUERY, d.getId(), d.getName(),d.getLocation(),d.getDateOfBirth());   
		
	}

	public int update(Customer c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(UPDATE_QUERY, c.getName(), 
			      c.getDateOfBirth(),c.getLocation(),c.getId()); 
	}

	@Override
	public int delete(Customer r) {
		// TODO Auto-generated method stub
		String s="delete from Customer where id='"+r.getId()+"' "; 
		return jdbcTemplate.update(s);
	}

public Customer findbyId(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SELECT_QUERY, BeanPropertyRowMapper.newInstance(Customer.class), id); 
	}	
	
}
