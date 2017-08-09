package com.bizpro.techpm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.bizpro.techpm.model.Proyecto;

@RepositoryRestResource(collectionResourceRel = "proyecto", path = "proyecto")
public interface ProyectoRepository extends MongoRepository<Proyecto, String>{

}
