package net.schweibuz.customerdemo.service;

import net.schweibuz.customerdemo.model.Customer;

import java.util.List;

/**
 * Created by andmat on 2019-08-07.
 */
public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();

}
