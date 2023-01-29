package com.java.arrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("First");
        StringBuilder sb2 = new StringBuilder("Second");
        StringBuilder sb3 = new StringBuilder("Third");

        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
//        for (int i = 0; i < list.size(); i++) {
//            list.get(i).append("!");
//            //  System.out.println(i);
//
//        }

        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        System.out.println();


        list.remove(2);
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }


        System.out.println();


        list.remove(sb1);
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }


        System.out.println();

        System.out.println(list.toString());


    }
}

