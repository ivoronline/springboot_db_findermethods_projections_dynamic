package com.ivoronline.springboot_db_findermethods_projections_dynamic.controllers;

import com.ivoronline.springboot_db_findermethods_projections_dynamic.dto.PersonDTO;
import com.ivoronline.springboot_db_findermethods_projections_dynamic.entities.Person;
import com.ivoronline.springboot_db_findermethods_projections_dynamic.entities.PersonView;
import com.ivoronline.springboot_db_findermethods_projections_dynamic.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // FIND PERSON BY NAME
  //================================================================
  @RequestMapping("FindPersonByName")
  Person findPersonByName() {
    Person person = personRepository.findByName("John", Person.class);
    return person;
  }

  //================================================================
  // FIND PERSON VIEW BY NAME
  //================================================================
  @RequestMapping("FindPersonViewByName")
  PersonView findPersonViewByName() {
    PersonView personView = personRepository.findByName("John", PersonView.class);
    return     personView;
  }

  //================================================================
  // FIND PERSON DTO BY NAME
  //================================================================
  @RequestMapping("FindPersonDTOByName")
  PersonDTO findPersonDTOByName() {
    PersonDTO personDTO = personRepository.findByName("John", PersonDTO.class);
    return    personDTO;
  }

}
