package com.vikas.task.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private Long id;
	private String dno;
	private String town;
	private String district;
	private String state;
	
	public Address() {
		super();
	}
	public Address(Long id, String dno, String town, String district, String state) {
		super();
		this.id = id;
		this.dno = dno;
		this.town = town;
		this.district = district;
		this.state = state;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
