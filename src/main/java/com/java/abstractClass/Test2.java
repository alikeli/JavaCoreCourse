package com.java.abstractClass;

import java.util.SortedMap;

public class Test2 {

}

class Employee {
    double salary;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Have breakfast");
    }

    void sleep() {
        System.out.println("go to bed");
    }
}

class Doctor extends Employee {
    void lechit() {
        System.out.println("take a pill");
    }
}

class Teacher extends Employee implements helpAble {
    void eat() {
        System.out.println("Have breakfast teacher");
    }

    int valueOfStudent;

    void teach() {
        System.out.println("Teach");
    }

    public void help() {
        System.out.println("Pomogaet");
    }

    public void tushitPojar() {
        System.out.println("Tushit");
    }

}

class Driver extends Employee implements helpAble, swimAbel {
    String nameOfCar;

    void drive() {
        System.out.println("drive a car");
    }

    @Override
    public void help() {
        System.out.println("Voditel pomogaet");
    }

    @Override
    public void tushitPojar() {
        System.out.println("voditel tushit");

    }

    @Override
    public void swim() {
        System.out.println("voditel plavaet");
    }
}

interface helpAble {
    void help();

    void tushitPojar();
}

interface swimAbel {
    void swim();
}