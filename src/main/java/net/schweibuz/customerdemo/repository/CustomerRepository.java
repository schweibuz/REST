package net.schweibuz.customerdemo.repository;

import net.schweibuz.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by andmat on 2019-08-07.
 * Repository interface for {@link Customer} class.
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
