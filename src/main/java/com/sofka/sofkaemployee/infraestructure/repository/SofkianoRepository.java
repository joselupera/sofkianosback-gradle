package com.sofka.sofkaemployee.infraestructure.repository;

import com.sofka.sofkaemployee.domain.model.Sofkiano;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SofkianoRepository extends MongoRepository<Sofkiano, String>{
  Sofkiano findByid(String id);
  Iterable<Sofkiano> findByNameIgnoreCase(String name);
  Iterable<Sofkiano> findByLastNameIgnoreCase(String lastName);
  Iterable<Sofkiano> findByIdProjectIgnoreCase(String idProject);
}
