package com.crud.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employee_Info")//Table Name
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto increment unique id
	private Long empId; 
	
	@Column(name = "Emp_Name") //Column name
	private String empName;
	
	@Column(name = "Designation") //Column name
	private String designation;
	
	@Column(name="Salary") //Column name
	private String salary;
	
	@CreationTimestamp //inbuilt annotation for current time  
	@Column(name = "Creation_Date")//Column name
	private Date createdDate;
	
	@UpdateTimestamp //auto update current time
	@Column(name = "Updated_Date")//Column name
	private Date updatedDate;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public Employee(Long empId, String empName, String designation, String salary, Date createdDate, Date updatedDate) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	
	
}
