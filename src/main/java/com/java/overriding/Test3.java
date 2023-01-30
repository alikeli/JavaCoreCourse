package com.java.overriding;

public class Test3 {

}

class Animal1 {
    String showName() {
        return "someAnimal";
    }

    void showInfo() {
        System.out.println("Name of animal - " + showName());
    }
}

class Mouse1 extends Animal1 {
    String showName() {
        return "mouse";
    }

    public static void main(String[] args) {
        Animal1 an = new Mouse1();
        an.showInfo();
    }


}
