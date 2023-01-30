package com.java.overriding;

public class Test4 {

    String s1 = "privet";
    static double d1 = 3.14;

    int summa(int... ints) {
        int result = 0;
        for (int a : ints) {
            result+=0;
        }
        return result;
    }

    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends Test4 {
 //   String s2 = super.s1 + "drug";
    boolean s1 = true;
    int summa(int ... i) {
        int result = super.summa(i);
        System.out.println("Summa : " + result);
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);

    }
}
