package com.cg.gla.fs.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.gla.fs.model.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer,String> {

}
