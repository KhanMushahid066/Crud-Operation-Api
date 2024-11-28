package com.crud.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.repository.EmployeeRepository;
import com.crud.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	public Employee createEmp(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public Employee getEmpById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public Employee updateEmpById(Long id,Employee emp) {
		if(employeeRepository.existsById(id)) {
			emp.setEmpId(id);//??
			employeeRepository.save(emp);//save value in the data base //save is a  inbuilt method
		}
		return emp;
	}
	
	public void deleteEmpById(Long id) {
		employeeRepository.deleteById(id);
	}
}
