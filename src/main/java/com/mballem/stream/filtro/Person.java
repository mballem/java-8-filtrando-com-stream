package com.mballem.stream.filtro;

/**
 * Created by Ballem on 22/07/2015.
 */
public class Person {

    private String name;

    private Integer age;

    private Double salary;

    public Person(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
