package com.vikas.task.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vikas.task.model.Employee;
import com.vikas.task.model.Organisation;
import com.vikas.task.repository.EmployeeRepository;
import com.vikas.task.repository.OrganisationRepository;

@RestController
public class Controller {
	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	OrganisationRepository repo1;
	
	@GetMapping("/emp")
	public List<Employee> getallemp(){
		return repo.findAll();
	}
	@PostMapping("/saveemp")
	public void saveemp(@RequestBody Employee emp) {
		repo.save(emp);
	}
	
	@GetMapping("/org")
	public List<Organisation> getallorg(){
		return repo1.findAll();
	}
	@PostMapping("/saveorg")
	public void saveorg(@RequestBody Organisation org) {
		repo1.save(org);
		
	}
	@GetMapping("/empoforg/{id}")
    public List<Employee> getempbyorg(@PathVariable Long id) throws NoValuePresent, NoEmployeePresent{
		Organisation o=repo1.findByOid(id);
    	List<Employee> employees=new ArrayList<Employee>();
    	for(Employee x:repo.findAll()) {
    		if(x.getOid()==id) {
    			employees.add(x);
    		}
   
    	}
    	if(o==null) {
    		throw new NoValuePresent(600,"No organization with given id is present");
    	}
    	else if(employees.isEmpty()) {
    		throw new NoEmployeePresent(505,"no employee are present");
    	}
    	return employees;
    }
}
