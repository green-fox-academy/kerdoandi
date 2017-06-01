package com.greenfox.repository;

import com.greenfox.model.MealType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealTypeRepository extends CrudRepository<MealType, Long> {
}
