package com.vikas.task.model;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Organisation {
	@Id
	private Long oid;
	private String oname;
	private String location;
	private String type;
	public Organisation(Long oid, String oname, String location, String type) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.location = location;
		this.type = type;
	}
	public Organisation() {
		super();
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
