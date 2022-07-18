package com.vikas.task.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long eid;
	private Long oid;
	private String name;
	private String role;
	private Double salary;
	@OneToOne(cascade=CascadeType.ALL)
	private Address add;
	
	public Employee() {
		super();
	}
	public Employee(Long eid,Long oid, String name, String role, Double salary, Address add) {
		super();
		this.eid = eid;
		this.oid=oid;
		this.name = name;
		this.role = role;
		this.salary = salary;
		this.add = add;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	

}
