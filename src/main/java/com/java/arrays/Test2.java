package com.java.arrays;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int array1[] = {1, 9, 55, 8, -8, -9, 0};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");


        }
        System.out.println();

        Arrays.sort(array1);
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + " ");
        }

        System.out.println();
        int index = Arrays.binarySearch(array1, -8);
        System.out.println(index);
        int index1 = Arrays.binarySearch(array1, -100);
        System.out.println(index1); //not found
    }
}
