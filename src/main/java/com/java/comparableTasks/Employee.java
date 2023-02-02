package com.java.comparableTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String toString() {
        return "Employee {" + "id=" + id +
                ", name=" + name +
                ", surname=" + surname +
                " , salary=" + salary + "}";
    }


    @Override
    public int compareTo(Employee o) {
//        if (this.id == o.id) {
//            return 0;
//
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 1;
//        }


        //return this.id-o.id;


////   return this.id.compareTo(o.id);

        int result = this.name.compareTo(o.name);
        if (result == 0) {
           result = this.surname.compareTo(o.surname);
        }
        return result;

    }
}

class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(1, "Ivan ", "Ivanov", 1500);
        Employee emp2 = new Employee(100, "Olga ", "Ivanova", 2500);
        Employee emp3 = new Employee(55, "Anna ", "Sidorova", 3500);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting " + list);
        Collections.sort(list);
        System.out.println("After sorting " + list);

    }
}
