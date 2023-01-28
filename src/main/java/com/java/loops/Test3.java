package com.java.loops;

public class Test3 {
    //creat hours and minutes
    public static void main(String[] args) {
        OUTER:
        for (int c = 0; c <= 23; c++) {
            INNER:
            for (int m = 0; m <= 59; m++) {
                System.out.println(c + ":" + m);
                if (m == 30) {
                    break INNER;
                }
            }
        }


        OUTER:
        for (int c = 0; c <= 23; c++) {
            INNER:
            for (int m = 0; m <= 59; m++) {
                System.out.println(c + ":" + m);
                if (m == 20) {
                    continue OUTER;
                }
            }
        }
    }
}




