package com.example.accessingdatajpa;

import java.util.List;

import com.example.accessingdatajpa.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called customerRepository
 * CRUD refers Create, Read, Update, Delete
 */
@Repository

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);

	Customer findById(long id);
}
