package com.java.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Liza");
        list.add("Dasha");
        list.add("Ivan");
        list.add("Olga");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("item  = " + iterator.next());
        }

        Iterator<String> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
            iterator1.remove();
        }
        System.out.println(list);

//        System.out.println(list.toString());
//
//        ArrayList<String> list2 = (ArrayList<String>) list.clone();
//        System.out.println(list2 == list);
//        System.out.println(list2.get(0) == list.get(0));

    }
}
