package com.vikas.task.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vikas.task.model.Student;
@Repository
public interface StudentInterface extends MongoRepository<Student, String> {

}
