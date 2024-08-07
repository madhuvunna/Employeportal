package com.ReactGrid.springboot.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ReactGrid.springboot.dao.EmployeportalRepository;
import com.ReactGrid.springboot.model.Employeprotal;

@Service
public class EmployeportalServiceImpl implements EmployeportalService {

	@Autowired
	//@Qualifier("CustomersRepository")
	private EmployeportalRepository employeportalRepository;

	
//	@Override
//	public Customers createCustomer(Customers customer) {
//		Customers customer1 = customersRepository.findByCustomersEmail(customer.getCustomersEmail());
//		
//		if(customer1==null) {
//			return customersRepository.save(customer);
//		}else {
//			return null;
//		}
//			
//		((Iterable<Customers>) customer).forEach(cust->
//		{
//			Customers customer1 = 	customersRepository.findByCustomersEmail(cust.getCustomersEmail());
//			if(customer1==null) {
//				customersRepository.save(cust);
//			}else {
//				cust.setCustomersId(customer1.getCustomersId());
//			
//			customersRepository.save(cust);
//			
//		}
//			
//		
//	});
//		return customer;
//	}

	@Override
	public List<Employeprotal> findAll() {
		return  employeportalRepository.findAll();
	}


	@Override
	public Employeprotal createCustomer(Employeprotal customer) {
		return null;
	}

//	@Override
//	public Customers createCustomer(Customers customer) {
//		
//		return customersRepository.save(customer);
//	}

}
