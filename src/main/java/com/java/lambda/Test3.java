package com.java.lambda;

public class Test3 {
static void def(Test5 t) {
    System.out.println(t.abc("Privet"));
}

    static void def1(Test6 t) {
        System.out.println(t.abc("Privet","Poka") );
    }

    public static void main(String[] args) {
        def((String s)->s.length());
        def1((String s, String t)->t.length());
    }

}

interface Test5 {
    int abc(String s);
}

interface Test6 {
    int abc(String s, String t);
}

