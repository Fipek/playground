package com.fipek.playground.streamsapi.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private Gender gender;
    private List<String> books;
    private Optional<String> secondName;
}
