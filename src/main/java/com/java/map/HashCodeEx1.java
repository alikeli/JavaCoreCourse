package com.java.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student3, Double> map = new HashMap<>();
        Student3 st1 = new Student3("Ivan", "Ivanov", 3);
        Student3 st2 = new Student3("Oleg", "Petrov", 2);
        Student3 st3 = new Student3("Liza", "Petrova", 1);
        Student3 st4 = new Student3("Olga", "Sidorova", 4);

        map.put(st1, 8.5);
        map.put(st2, 6.5);
        map.put(st3, 4.7);
        map.put(st4, 3.5);
        System.out.println(map);

        Student3 st5 = new Student3("Olga", "Sidorova", 4);
        boolean result = map.containsKey(st5);
        System.out.println("result = " + result);
    }


}

class Student3 {
    String name;
    String surname;
    int course;


    Student3(String name, String surname, int course) {
        this.name=name;
        this.surname=surname;
        this.course=course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return course == student3.course && Objects.equals(name, student3.name) && Objects.equals(surname, student3.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
