package com.fipek.playground.streamsapi;


import com.fipek.playground.streamsapi.model.Gender;
import com.fipek.playground.streamsapi.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsApiApplication {
    public static void main(String[] args) {
        List<Person> people = getPeople();
        // Declarative approach

        // Filter
        List<Person> females = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        //females.forEach(System.out::println);

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(Collectors.toList());

        //sorted.forEach(System.out::println);

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);

        //System.out.println(allMatch);

        // Any match

        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 8);

        //System.out.println(anyMatch);

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));

        //System.out.println(noneMatch);

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge));
        //.ifPresent(System.out::println);

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge));
        //.ifPresent(System.out::println);

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach(((gender, people1) -> {
            //System.out.println(gender);
            people1.forEach(System.out::println);
            //System.out.println();
        }));

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        List<String> collect = people.stream().flatMap(person -> person.getBooks().stream()).collect(Collectors.toList());
        System.out.println(collect);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("James Bond", 20, Gender.MALE, List.of("Python", "Java", "JavaScript")),
                new Person("Alina Smith", 33, Gender.FEMALE, List.of("Python", "JavaScript")),
                new Person("Helen White", 57, Gender.FEMALE, List.of("Java", "JavaScript")),
                new Person("Alex Boz", 14, Gender.MALE, List.of()),
                new Person("Jamie Goa", 99, Gender.MALE, List.of("JavaScript")),
                new Person("AJamie Goa1", 99, Gender.FEMALE, List.of("Java")),
                new Person("Anna Cook", 7, Gender.FEMALE, List.of("Python", "Java")),
                new Person("Zelda Brown", 120, Gender.FEMALE, List.of("Python", "Java", "JavaScript"))
        );
    }
}
