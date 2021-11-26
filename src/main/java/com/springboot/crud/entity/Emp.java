package com.springboot.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity

public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long empId;
	private @Getter @Setter String empName;
	private @Getter @Setter Integer salary;
	private @Getter @Setter String Address;
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*
	 * public Emp(Long empId, String empName, int salary,String Address) { super();
	 * this.empId = empId; this.empName = empName; this.salary = salary;
	 * this.Address=Address; }
	 * 
	 * public Long getEmpId() { return empId; }
	 * 
	 * public void setEmpId(Long empId) { this.empId = empId; }
	 * 
	 * public String getEmpName() { return empName; }
	 * 
	 * public void setEmpName(String empName) { this.empName = empName; }
	 * 
	 * public int getSalary() { return salary; }
	 * 
	 * public void setSalary(int salary) { this.salary = salary; }
	 * 
	 * 
	 * public String getAddress() { return Address; }
	 * 
	 * public void setAddress(String address) { Address =address; }
	 * 
	 * 
	 * 
	 */
}
