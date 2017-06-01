package com.greenfox.repository;

import com.greenfox.model.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealsRepository extends CrudRepository<Meal, Long> {

}
