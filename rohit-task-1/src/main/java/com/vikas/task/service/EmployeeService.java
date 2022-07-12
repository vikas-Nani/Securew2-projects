package com.vikas.task.service;

import java.util.List;

import com.vikas.task.model.Employeemodel;

public interface EmployeeService {
	
	
	List<Employeemodel> getallemp();
	void saveemp(Employeemodel employee);
	void updateemp(Employeemodel employee,Long id);
	void deleteemp(Long id);
	Employeemodel getbyid(Long id);

}
