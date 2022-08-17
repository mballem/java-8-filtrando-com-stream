package com.mballem.stream.filtro;

import java.util.List;
import java.util.stream.Collectors;

public class TestFilterThree {

    public static void main(String[] args) {
        testThree(MainRepository.persons());
    }

    /**
     * Listagem 4
     */
    private static void testThree(List<Person> persons) {
        List<Person> tempPersons = persons.stream()
                .filter((Person p) -> p.getSalary() > 3400)
                .collect(Collectors.toList());

        tempPersons.forEach(System.out::println);
    }
}
