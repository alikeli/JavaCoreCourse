package com.java.static_final;

public class Student {

    String name;
    int course;
    static int count;
    int a;

    public Student(String name, int course) {
        count++;
        name = this.name;
        course = this.course;
        System.out.println("Student " + count + " was created");
    }

    public static void showCount() {
        System.out.println(count + " students were created ");

    }

    public void showInfo() {
        System.out.println("Welcome to the student class");
    }

    void abc() {
        a++;
        count++;
    }

    static void absd() {
        count++;
        //     a++;  there isn't an object.Without an object variable a doesn't  exist
        Student st1 = new Student("Anna", 2);
        st1.a++;
    }

    public static void main(String[] args) {

    }

}

