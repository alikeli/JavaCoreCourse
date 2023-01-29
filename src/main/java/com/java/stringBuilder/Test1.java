package com.java.stringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50);

        System.out.println(sb2.subSequence(5, 8));
        System.out.println(sb2.append(22));
        System.out.println(sb2.append(true));
        System.out.println(sb2.append(sb2));
        System.out.println(sb2.insert(4, 55));
        System.out.println(sb2.delete(4, 6));
        System.out.println(sb2.deleteCharAt(8));
        System.out.println(sb2.reverse());
        System.out.println(sb2.replace(5, 10, " "));
        System.out.println(sb2.reverse());

    }
}
