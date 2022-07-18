package com.vikas.task.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vikas.task.model.Organisation;
@Repository
public interface OrganisationRepository extends MongoRepository<Organisation, Long> {
public Organisation  findByOid(Long oid);

}
