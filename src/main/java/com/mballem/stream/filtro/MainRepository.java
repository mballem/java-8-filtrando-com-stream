package com.mballem.stream.filtro;

import java.util.ArrayList;
import java.util.List;

/**
 * Listagem 1
 */
public class MainRepository {

    public static List<Person> persons() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ana Maria", 25, 3200.50));
        persons.add(new Person("Bianca", 35, 3440.50));
        persons.add(new Person("Marta", 28, 5500.00));
        persons.add(new Person("Breno", 22, 3330.70));
        persons.add(new Person("Mario", 34, 2200.50));
        persons.add(new Person("Ricardo", 55, 3200.00));
        persons.add(new Person("Pietra", 26, 3400.50));
        persons.add(new Person("Fabiana", 44, 4200.60));
        persons.add(new Person("Airton", 29, 1500.50));
        return persons;
    }
}
