package com.fipek.playground.optional;

import com.fipek.playground.optional.model.Person;

import java.util.Optional;

public class OptionalApplication {

    public static void main(String[] args) {
        //Optional<String> hello = Optional.of("hello"); // if variable null, it's gonna throws npe.
        Optional<String> hello = Optional.ofNullable(null); // if variable null, it won't throw npe.

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());

        // orElse & orElseGet

        String orElse = hello
                .map(String::toUpperCase)
                .orElse("world");

        System.out.println(orElse);

        String orElseGet = hello
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    // ... extra computation to retrieve the value
                    return "world";
                });

        System.out.println(orElseGet);

        // ifPresent & ifPresentOrElse

        Optional<String> hello1 = Optional.ofNullable(null);

        hello1.ifPresent(System.out::println);

        hello1.ifPresentOrElse(System.out::println, () -> {
            System.out.println("orElse");
        });

        Person person = new Person("james", null);

        String email = person
                .getEmail()
                .map(String::toLowerCase)
                .orElse("email not provided.");

        System.out.println(email);
    }
}
