package com.java.string;

public class Test2 {
    public static void main(String[] args) {
        String s1 = "fggfgghh";
        String s2 = s1.substring(3);
        System.out.println(s2);

        String s11 = s1.substring(3,6);
        System.out.println(s11);


        String s12 = "   String  ";
        System.out.println(s12);
        System.out.println(s12.trim());
    }
}
