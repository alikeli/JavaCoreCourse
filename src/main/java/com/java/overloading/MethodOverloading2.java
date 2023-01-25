package com.java.overloading;

public class MethodOverloading2 {
    int sum(int i1, int i2) {
        return i1 + i2;

    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }


}

class MethodOverloadingTest2 {
    public static void main(String[] args) {
        MethodOverloading2 mo = new MethodOverloading2();
        int a = mo.sum(5, 7);
        System.out.println(a);
        String s = mo.sum("Privet, ", "Sweetie");
        System.out.println(s);

    }
}