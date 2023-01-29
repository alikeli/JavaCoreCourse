package com.java.arrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add("ArrayList");
        list1.add(new StringBuilder("Privet"));
        Integer i = 15;
        list1.add(i);
        System.out.println(list1);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("first");
        list2.add("second");
        list2.add("third");
        System.out.println(list2);
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Privet");
        list3.add("Poka");
        list3.add("Good");
        list3.add(1, "Good day");
        for (String s : list3) {
            System.out.print(s + " ");
        }


        System.out.println();


        System.out.println(list3.get(2));


    }


}
