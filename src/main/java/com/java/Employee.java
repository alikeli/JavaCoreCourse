package com.java;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String department;
    String surname;

    int count;

    public int getId() {
        return id;
    }

    public Employee(String name, int age, double salary, String department) {
        count = ++id;
        age = this.age;
        name = this.name;
        salary = this.salary;
        department = this.department;
    }

    public Employee(String name, int age, double salary, String department, String surname) {
        this(name, age, salary, department);
        surname = this.surname;
        count = ++id;
    }


}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Liza", 25, 2500, "it");
        Employee emp1 = new Employee("Liza", 25, 2800, "hr", "Ivanova" );

        System.out.println(emp.getId());
    }
}
