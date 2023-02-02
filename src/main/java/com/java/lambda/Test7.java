package com.java.lambda;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Test7 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Olga", 'w', 25, 4, 5.5);
        Student st2 = new Student("Ivan", 'm', 20, 1, 8.7);
        Student st3 = new Student("Max", 'm', 18, 5, 9.9);
        Student st4 = new Student("Jack", 'm', 17, 3, 7);


        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        StudentInfo si = new StudentInfo();

        si.testStudents(list, (Student s) -> {
            return s.avrGrade < 8.5;
        });
        System.out.println("--------------------");

        si.testStudents(list, (Student s) -> {
            return s.course > 2;
        });
        System.out.println("--------------------");
        si.testStudents(list, (Student s) -> {
            return s.age > 22;
        });
        System.out.println("--------------------");

        si.testStudents(list, (Student s) -> {
            return s.age > 20 && s.avrGrade > 5 && s.course > 1;
        });
        System.out.println("--------------------");


    }
}
class Student {
    String name;
    char sex;
    int age;
    int course;
    double avrGrade;

    Student(String name, char sex, int age, int course, double avrGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avrGrade = avrGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avrGrade);
    }
}


class StudentInfo {
    void printStudent(Student s) {
        System.out.println("Name of student: " + s.name + ", sex of student: " + s.sex + ", " +
                "age of student: " + s.age + " , course of student: " + s.course + " , average grade: " + s.avrGrade);
    }


    void testStudents(ArrayList<Student> list, Predicate<Student> sc) {
        for (Student s : list) {
            if (sc.test(s)) {
                printStudent(s);
            }
        }
    }
}


