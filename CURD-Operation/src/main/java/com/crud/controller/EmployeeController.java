package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.service.EmployeeService;

@RestController
@RequestMapping("api/v1")//domain name www.exapmle.com/getAll /createEmp /getEmpById/{id}
public class EmployeeController {

    @Autowired
	private EmployeeService employeeService;//object create 	

	@GetMapping("/getAll") //GET URL
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
	
	@PostMapping("/createEmp")// URL
	public Employee createEmp(@RequestBody Employee emp) {
		return employeeService.createEmp(emp);
	
	}
	
	@GetMapping("/getEmpById/{id}")//URL with ID
	public Employee getEmpById(@PathVariable Long id) {
		return employeeService.getEmpById(id);
	}
	
	@PutMapping("/updateEmpById/{id}") //URL with ID to Update value
	public Employee updateEmpById(@PathVariable Long id,@RequestBody Employee emp) {
		return employeeService.updateEmpById(id,emp);
	}
	
	@DeleteMapping("/deleteEmpById/{id}")
	public void deleteEmpById(@PathVariable Long id) {
		employeeService.deleteEmpById(id);
	}
}
