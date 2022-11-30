package com.example.demo1.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo1.DAO.CustomerrDAO;
import com.example.demo1.Entity.Customer;

@RestController
public class CustomerController {
@Autowired 
CustomerrDAO  cDAO;
	
	@RequestMapping("/select")
	public List<Customer> f() {
		return cDAO.findAll();
	}
	@RequestMapping("/selectbyid/{id}")
	public Customer G(@PathVariable int id) {
		return cDAO.findbyId(id);
	}
	
	@PostMapping("/insert")
	public int x(@RequestBody Customer d) {
	  return cDAO.save(d); 
	  }
	@PutMapping("/update")
	public int y(@RequestBody Customer d) {
	  return cDAO.update(d); 
	  }
	@DeleteMapping("/delete")
	public int z(@RequestBody Customer d) {
	  return cDAO.delete(d); 
	  }
	
}
