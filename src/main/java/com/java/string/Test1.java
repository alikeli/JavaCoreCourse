package com.java.string;

public class Test1 {

    public static void main(String[] args) {
        String s = new String("Privet");
        String s1 = "Privet";
        String s3 = "Privettt";
        String s4 = "Privet";
        System.out.println(s4.length());
        System.out.println(s3 == s4);
        System.out.println(s1 == s4);

        int i1 = s3.indexOf("ttt");
        System.out.println(i1);
        int i2 = s3.indexOf("P");
        System.out.println(i2);

        System.out.println(s3.startsWith("i", 2));
    }
}
