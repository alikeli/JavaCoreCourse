package com.java.loops;

public class Loop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++, abc(10)) {
            System.out.println(i);
        }


    }

    static void abc(int n) {
        System.out.println(n);
    }


}
