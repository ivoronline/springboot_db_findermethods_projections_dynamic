package com.ivoronline.springboot_db_findermethods_projections_dynamic.runners;

import com.ivoronline.springboot_db_findermethods_projections_dynamic.entities.Person;
import com.ivoronline.springboot_db_findermethods_projections_dynamic.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  @Autowired PersonRepository personRepository;

  @Override
  @Transactional
  public void run(String... args) {
    personRepository.save(new Person("John", "Carpenter", 20));
    personRepository.save(new Person("Bill", "Wreck"    , 40));
  }

}

