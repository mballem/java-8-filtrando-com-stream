package com.mballem.stream.filtro;

import java.util.List;

public class TestFilterOne {

    public static void main(String[] args) {
        testOne(MainRepository.persons());
    }

    /**
     * Listagem 2
     */
    private static void testOne(List<Person> persons) {
        Double total = 0.0;

        for (Person person : persons) {

            if (person.getAge() >= 30) {
                total = total + person.getSalary();
            }
        }

        System.out.printf("Sum of Salaries is %.2f", total);
    }
}
