package com.example.dbinit.repository;

import com.example.dbinit.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
