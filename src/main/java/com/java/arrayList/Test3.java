package com.java.arrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Liza");
        list.add("Dasha");
        list.add("Ivan");
        list.add("Olga");

        System.out.println(list.toString());

        ArrayList<String> list2 = (ArrayList<String>) list.clone();
        System.out.println(list2 == list);
        System.out.println(list2.get(0) == list.get(0));

    }
}
