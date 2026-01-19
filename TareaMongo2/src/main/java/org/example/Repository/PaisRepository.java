package org.example.Repository;

import org.example.model.Pais;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaisRepository extends MongoRepository<Pais, String> {


}
