package com.java.overriding;

public class Teat1  {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee employee = new Doctor();
        System.out.println(employee.age);
        System.out.println(employee.salary);
        System.out.println(employee.experience);
        System.out.println(employee.name);
        employee.eat();
        employee.sleep();


        Employee employee1 = new Teacher();
        employee1.eat();

        System.out.println(employee1.salary);
        Employee employee2 = new Driver();
    }

}

class Employee {
    double salary;
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("Have breakfast");

    }
    void sleep () {
        System.out.println("go to bed");
    }

}

class Doctor extends Employee {
    void lechit() {
        System.out.println("take a pill");
    }
}

class Teacher extends Employee {
    void eat() {
        System.out.println("Have breakfast teacher");

    }

    int valueOfStudent;


    void teach() {
        System.out.println("Teach");
    }

}

class Driver extends Employee {
    String nameOfCar;

    void drive() {
        System.out.println("drive a car");
    }

}
