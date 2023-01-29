package com.java.arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] array1 = new int [3];
        try {

            array1[0] = 1;
            array1[1] = 2;
            array1[2] = 3;
            array1[3] = 4;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There isn't a value");
        }
    }
}
