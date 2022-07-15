package com.vikas.task.model;

import java.util.HashMap;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Student {
	@Id
	private Long id;
	private Long stuid;
	private String name;
	private String sclass;
	private HashMap<String,Integer> map;
	
	public Student() {
		super();
	}
	public Student( String name, String sclass,HashMap<String,Integer> map,Long stuid) {
		super();
		
		this.name = name;
		this.sclass = sclass;
		this.map=map;
		this.stuid=stuid;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}
	public Long getStuid() {
		return stuid;
	}
	public void setStuid(Long stuid) {
		this.stuid = stuid;
	}
	
	

}
