package com.java;

public class MethodOverloading {

    void show(int i) {
        System.out.println(i);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s1) {
        System.out.println(s1);

    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String s = "Privet"+1+2;
        mo.show(s);

    }
}