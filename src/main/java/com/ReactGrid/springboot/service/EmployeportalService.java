package com.ReactGrid.springboot.service;


import java.util.List;

import com.ReactGrid.springboot.model.Employeprotal;

public interface EmployeportalService {

	public Employeprotal createCustomer(Employeprotal customer);

	public List<Employeprotal> findAll();
}
