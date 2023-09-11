package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.domain.Example;
// import org.springframework.data.domain.PageRequest;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.demo.db.Person;
// import com.example.demo.db.AddressRepository;
// import com.example.demo.db.PersonRepository;
// import com.example.demo.models.pagination.PaginatedResponse;
// import com.example.demo.models.pagination.PaginationRequest;
import com.example.demo.models.person.PersonFilter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class PersonController2 {

    // @Autowired PersonRepository personRepo;
    // @Autowired AddressRepository addressRepo;

    // @QueryMapping
    // public PaginatedResponse<Person> peopleWithParams(@Argument PaginationRequest paging, @Argument PersonFilter filter) {
    //     var ex = Example.of(Person.builder()
    //         .name(filter.getName())
    //         .age(filter.getAge())
    //         .build());
    //     var pr = paging.isEnabled() ? 
    //         PageRequest.of(paging.getPage(), paging.getPerPage()) :
    //         PageRequest.ofSize(Math.max((int) personRepo.count(ex), 1));
    //     var page = personRepo.findAll(ex, pr);
    //     return new PaginatedResponse<Person>(pr, page);
    // }

    // @BatchMapping(maxBatchSize = 20)
    // public Map<Person, List<Address>> addresses(List<Person> people) {
    //     var addresses =  addressRepo.findAllByPersonIn(people)
    //         .stream()
    //         .collect(Collectors.groupingBy(Address::getPerson));
    //     return Utils.associate(people, (person) -> addresses.getOrDefault(person, List.of()));
    // }
}
