package com.vikas.task.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table
public class Organizationmodel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long oid;
	private String oname;
	private String location;
	@ManyToMany
	List<Employeemodel> emp;
	
	
	
	
	public Organizationmodel() {
		super();
	}
	public Organizationmodel(Long oid, String oname, String location, List<Employeemodel> emp) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.location = location;
		this.emp = emp;
	}
	public Long getOid() {
		return oid;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<Employeemodel> getEmp() {
		return emp;
	}
	public void setEmp(List<Employeemodel> emp) {
		this.emp = emp;
	}
	
	

}
