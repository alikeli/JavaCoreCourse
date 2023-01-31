package com.java.polymorphism;

public class Test2 {
    public static void main(String[] args) {
        JumpAbel j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof JumpAbel) {
            System.out.println("j is JumpAble");
        }

        if (m instanceof Human) {
            System.out.println("m is Human");
        }


    }

}

interface JumpAbel {

}

class Human implements JumpAbel {

}

class Man extends Human {
}

class Student {
}

