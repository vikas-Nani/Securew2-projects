package com.vikas.task.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Student {
	@Id
	private String id;
	private String name;
	private String sclass;
	private HashMap<String,Integer> map;
	
	public Student() {
		super();
	}
	public Student( String name, String sclass,HashMap<String,Integer> map) {
		super();
		
		this.name = name;
		this.sclass = sclass;
		this.map=map;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
	

}
