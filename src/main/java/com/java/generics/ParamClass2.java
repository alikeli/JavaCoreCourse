package com.java.generics;

public class ParamClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hi", 22);
        Pair<String, String> pair2 = new Pair<>("Hi", "How are you?");

        System.out.println(pair2);
        System.out.println(pair1);
    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;

    }

    public V2 getValue2() {
        return value2;
    }

    public String toString() {
        return "{value1 = " + value1 + "}" + "{value2 = " + value2 + "}";
    }

}
