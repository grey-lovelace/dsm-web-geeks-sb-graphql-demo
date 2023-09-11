package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import org.dataloader.DataLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.graphql.execution.BatchLoaderRegistry;
import org.springframework.stereotype.Controller;

import com.example.demo.Utils;
import com.example.demo.db.Address;
import com.example.demo.db.Person;
// import com.example.demo.db.AddressRepository;
// import com.example.demo.db.PersonRepository;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Controller
public class PersonController3 {

    // @Autowired PersonRepository personRepo;
    // @Autowired AddressRepository addressRepo;
    @Autowired BatchLoaderRegistry batchLoaderRegistry;

    // @PostConstruct
    // void init() {
    //     batchLoaderRegistry
    //         .forTypePair(Person.class, List.class)
    //         .withName("personAddressesLoader")
    //         .registerMappedBatchLoader((people, env) -> {
    //             var addresses =  addressRepo.findAllByPersonIn(people)
    //                 .stream()
    //                 .collect(Collectors.groupingBy(Address::getPerson));
    //             return Mono.just(Utils.associate(people, (person) -> addresses.getOrDefault(person, List.of())));
    //         });
    // }

    // @SchemaMapping
    // public CompletableFuture<List<Address>> addresses(
    //     Person person,
    //     DataLoader<Person, List<Address>> personAddressesLoader
    // ) {
    //     return personAddressesLoader.load(person);
    // }

    // @SchemaMapping
    // public CompletableFuture<List<Address>> addresses(
    //     Person person,
    //     DataLoader<Person, List<Address>> personAddressesLoader,
    //     @Argument String state
    // ) {
    //     return personAddressesLoader.load(person)
    //         .thenApply(addresses ->
    //             addresses.stream()
    //                 .filter(address -> Optional.ofNullable(state)
    //                     .map(s -> s.equalsIgnoreCase(address.getState()))
    //                     .orElse(true))
    //                 .toList()
    //         );
    // }
}
