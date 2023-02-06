package com.java.generics;

public class ParamClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Hi");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(2);
        System.out.println(info2);
        Info<Integer> info3 = new Info<>(22);
        System.out.println(info3);
        String s = info1.getValue();
        Integer x = info2.getValue();

    }

}

class   Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return value;
    }
}
