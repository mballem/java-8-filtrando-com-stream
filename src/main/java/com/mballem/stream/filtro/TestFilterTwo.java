package com.mballem.stream.filtro;

import java.util.List;

public class TestFilterTwo {

    public static void main(String[] args) {
        testTwo(MainRepository.persons());
    }

    /**
     * Listagem 3
     */
    private static void testTwo(List<Person> persons) {
        Double total = persons.stream()
                .filter(p -> p.getAge() >= 30)
                .mapToDouble(p -> p.getSalary())
                .sum();

        System.out.printf("Sum of Salaries is %.2f", total);
    }
}
