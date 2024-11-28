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
@Table (name = "Student_info")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long stdId;
	@Column(name ="Name")
	private String stdName;
	
	@Column(name ="Roll_No")
	private int stdRollno;
	
	@Column (name = "Marks")
	private double stdMarks;
	

	@CreationTimestamp  
	@Column(name = "Creation_Date")
	private Date createdDate;
	
	@UpdateTimestamp 
	@Column(name = "Updated_Date")
	private Date updatedDate;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long stdId, String stdName, int stdRollno, double stdMarks, Date createdDate, Date updatedDate) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdRollno = stdRollno;
		this.stdMarks = stdMarks;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdRollno=" + stdRollno + ", stdMarks="
				+ stdMarks + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public Long getStdId() {
		return stdId;
	}

	public void setStdId(Long stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollno() {
		return stdRollno;
	}

	public void setStdRollno(int stdRollno) {
		this.stdRollno = stdRollno;
	}

	public double getStdMarks() {
		return stdMarks;
	}

	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
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
	
	
}
