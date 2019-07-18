package com.epam.spring.tacocloud.repository;

import com.epam.spring.tacocloud.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository
        extends CrudRepository<Order, Long> {

}
