package com.crud.service;

import java.util.List;

import com.crud.entity.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	
	public Employee createEmp(Employee emp);
	
	public Employee getEmpById(Long id);

	public Employee updateEmpById(Long id, Employee emp);

	public void deleteEmpById(Long id);
}
