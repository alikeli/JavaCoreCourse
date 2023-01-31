package com.java.polymorphism;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Teacher();
        Employee e2 = new Driver();
        Employee e3 = new Doctor();
        //  HelpAble e4 = new Teacher();

        Employee[] employees = {e1,e2,e3};
        for(Employee emp : employees){
            emp.work();

        }
        System.out.println("-- -- -- -- -- --");

        e1.work();
        e1.help();
        e2.work();
        e3.work();
     //   e4.help();
    }
}

abstract class Employee implements HelpAble{
        void sleep() {
        System.out.println("Empl sleep");
    }
     abstract void work();
}

class Teacher extends Employee implements HelpAble{
    void work() {
        System.out.println("teacher works");
    }

   public void help() {
       System.out.println("Teacher helps");
    }

}

class Driver extends Employee implements HelpAble{
    void work() {
        System.out.println("driver works");
    }

    public void help() {
        System.out.println("driver helps");
    }

}


class Doctor extends Employee implements HelpAble{
    void work() {
        System.out.println("doctor  works");
    }

    public void help() {
        System.out.println("doctor helps");
    }

}

interface HelpAble {
    void help();
}
