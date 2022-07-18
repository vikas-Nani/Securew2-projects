package com.vikas.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vikas.task.model.Address;
@Repository
public interface addressrepository extends JpaRepository<Address, Long> {

}
