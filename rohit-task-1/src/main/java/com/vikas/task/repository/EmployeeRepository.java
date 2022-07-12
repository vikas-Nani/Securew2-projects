package com.vikas.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.task.model.Employeemodel;
@Repository
public interface EmployeeRepository extends JpaRepository<Employeemodel,Long> {

}
