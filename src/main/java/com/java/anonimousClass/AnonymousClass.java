package com.java.anonimousClass;

public class AnonymousClass {
    public static void main(String[] args) {

        Math plus = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a+b;
            }
        };


        Math minus = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a-b;
            }
        };



        Math multiplication = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a*b;
            }
        };
    }


}

interface Math {
    int doOperation(int a, int b);
}