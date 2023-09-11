package com.example.demo.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.db.Person;
// import com.example.demo.db.PersonRepository;
import com.example.demo.exceptions.NotFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PersonController {

    // @Autowired PersonRepository repo;

    // @QueryMapping
    // public List<Person> people() {
    //     return repo.findAll();
    // }

    // @QueryMapping
    // public Person person(@Argument UUID id) {
    //     return repo.findById(id)
    //         .orElseThrow(() -> new NotFoundException("No person with ID %s found".formatted(id)));
    // }

    // @MutationMapping
    // public Person createPerson(@Argument Person createPerson) {
    //     createPerson
    //         .getAddresses()
    //         .forEach(address -> address.setPerson(createPerson));
    //     return repo.saveAndFlush(createPerson);
    // }
}
