package com.java.generics;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
//        list.add("ok");
//        list.add(5);
//        list.add(new StringBuilder("Phrase"));
//        list.add(new Car1());


        list.add("Privet");
        list.add("Poka");
        list.add("How are you?");
        for (Object o : list) {
            System.out.println(o + " length = " + ((String) o).length());
        }

    }
}
