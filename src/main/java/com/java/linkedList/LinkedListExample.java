package com.java.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {


        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Oleg", 2);
        Student2 st3 = new Student2("Olga", 1);
        Student2 st4 = new Student2("Andrey", 4);
        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        System.out.println("LinkedList = " + student2LinkedList);
        Student2 st7 = new Student2("Andrey", 3);
        student2LinkedList.add(4, st7);
        System.out.println("LinkedList = " + student2LinkedList);
        Student2 st6 = new Student2("Liza", 3);
        student2LinkedList.add(1, st6);
        System.out.println("LinkedList = " + student2LinkedList);

    }

}

class Student2 {
    String name;
    int course;

    Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}

