package com.epam.spring.tacocloud.repository;

import com.epam.spring.tacocloud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
