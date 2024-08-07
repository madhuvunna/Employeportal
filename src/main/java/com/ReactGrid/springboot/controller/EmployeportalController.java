package com.ReactGrid.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ReactGrid.springboot.model.Employeprotal;
import com.ReactGrid.springboot.service.EmployeportalService;


//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/employe")
public class EmployeportalController {

	@Autowired
	private EmployeportalService employeportalService;
	
	@Qualifier("CustomersService")
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ResponseEntity<Object> createCustomer(@RequestBody Employeprotal customer) {
		customer = employeportalService.createCustomer(customer);
		return new ResponseEntity<>("Customer is created successfully with Id = " + customer.getEmployeId(),
				HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public ResponseEntity<Object> getCustomer()
	{
		List<Employeprotal> customerList = employeportalService.findAll();
		return new ResponseEntity<>(customerList, HttpStatus.OK);
	
}

}
