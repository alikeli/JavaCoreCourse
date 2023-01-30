package com.java.overriding;

public class Test2 {

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Animal animal = new Mouse();
        Animal animal2 = new Animal();
        Mouse mouse = new Mouse();
        test2.abc(animal);
        test2.abc(animal2);
        test2.abc(mouse);
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}