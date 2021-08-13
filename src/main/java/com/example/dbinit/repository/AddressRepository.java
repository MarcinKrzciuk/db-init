package com.example.dbinit.repository;

import com.example.dbinit.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository <Address, Long> {
}
