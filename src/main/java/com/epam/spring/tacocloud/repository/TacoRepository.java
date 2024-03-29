package com.epam.spring.tacocloud.repository;

import com.epam.spring.tacocloud.model.Taco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
