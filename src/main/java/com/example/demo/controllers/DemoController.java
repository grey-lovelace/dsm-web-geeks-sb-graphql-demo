package com.example.demo.controllers;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {

    public record Item(int value) {}

    public final static List<Item> items = IntStream
        .range(1, 10)
        .mapToObj(Item::new)
        .toList();

}
