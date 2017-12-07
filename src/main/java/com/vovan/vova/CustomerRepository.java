package com.vovan.vova;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByTitle(String title);
    List<Customer> findByMail(String title);
}