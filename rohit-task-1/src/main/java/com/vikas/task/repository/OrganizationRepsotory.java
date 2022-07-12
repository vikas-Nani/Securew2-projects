package com.vikas.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.task.model.Organizationmodel;
@Repository
public interface OrganizationRepsotory extends JpaRepository<Organizationmodel, Long> {

}
