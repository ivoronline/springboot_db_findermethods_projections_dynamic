package com.ivoronline.springboot_db_findermethods_projections_dynamic.repositories;

import com.ivoronline.springboot_db_findermethods_projections_dynamic.entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
  <T> T  findByName(String name, Class<T> type);
}


