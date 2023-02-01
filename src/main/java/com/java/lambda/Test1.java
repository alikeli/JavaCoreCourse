//package com.java.lambda;
//
//import java.util.ArrayList;
//
//public class Test1 {
//    public static void main(String[] args) {
//        ArrayList<Student> st = new ArrayList<>();
//        Student st1 = new Student("Olga", 'w', 25, 4, 5.5);
//        Student st2 = new Student("Ivan", 'm', 20, 1, 8.7);
//        Student st3 = new Student("Max", 'm', 18, 5, 9.9);
//        Student st4 = new Student("Jack", 'm', 17, 3, 7);
//
//
//        st.add(st1);
//        st.add(st2);
//        st.add(st3);
//        st.add(st4);
//        StudentInfo si = new StudentInfo();
//        si.printStudentOverGrade(st, 6);
//        System.out.println("-------------");
//        si.printStudentUnderGrade(st, 7);
//        System.out.println("-------------");
//        si.printStudentOverAge(st, 18);
//        System.out.println("-------------");
//        si.printStudentMixCondition(st, 5,30, 'w');
//        System.out.println("-------------");
//    }
//
//
//}
//
//class Student {
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avrGrade;
//
//    Student(String name, char sex, int age, int course, double avrGrade) {
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course= course;
//        this.avrGrade = avrGrade;
//    }
//
//}
//
//class StudentInfo {
//    void printStudent(Student s) {
//        System.out.println("Name of student: " + s.name + ", sex of student: " + s.sex + ", " +
//                "age of student: " + s.age + " , course of student: " + s.course + " , average grade: " + s.avrGrade);
//    }
//
//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
//
//        for (Student s : al) {
//            if (s.avrGrade > grade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentUnderGrade(ArrayList<Student> al, double grade) {
//
//        for (Student s : al) {
//            if (s.avrGrade < grade) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentOverAge(ArrayList<Student> al, int age) {
//
//        for (Student s : al) {
//            if (s.age > age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentOUnderAge(ArrayList<Student> al, int age) {
//
//        for (Student s : al) {
//            if (s.age < age) {
//                printStudent(s);
//            }
//        }
//    }
//
//    void printStudentMixCondition(ArrayList<Student> al, double grade, int age, char sex) {
//        for (Student s : al) {
//            if (s.avrGrade > grade && s.age < age && s.sex == sex) {
//                printStudent(s);
//            }
//        }
//    }
//
//
//}
