package com.java.static_final;

public class Student {

    String name;
    int course;
    static int count;

    public Student(String name, int course) {
        count++;
        name = this.name;
        course = this.course;
        System.out.println("Student " + count + " was created");
    }

    public static void showCount() {
        System.out.println(count + " students were created ");

    }

    public static void main(String[] args) {
        Student st1 = new Student("Liza", 1);
        Student st2 = new Student("Nina", 2);
        Student st3 = new Student("Ivan", 3);

        System.out.println(Student.count);
        showCount();
        st2.showCount();
        Student.showCount();
    }

}

class Test {


}
