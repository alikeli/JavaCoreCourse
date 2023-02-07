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

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(2.2);
        list2.add(15.0);
        list2.add(105.5);
        System.out.print("sum is =  ");
        System.out.println(sum( list2));


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(15);
        list3.add(105);
        System.out.print("sum is =  ");
        System.out.println(sum(list3));

        for (Object o : list2) {
            System.out.println(o);
        }


        showListInfo(list);
        showListInfo(list2);

    }


    static void showListInfo(List<?> list) {
        System.out.println(" My list has next items  " + list);
    }

    public static double sum(ArrayList<? extends Number> al) {
        double sum = 0;
        for (Number n : al) {
            sum += n.doubleValue();
        }
        return sum;
    }
}

class Test3 {

}
