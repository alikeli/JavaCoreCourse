package com.java.arrays;

public class Test3 {
    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > max) {
                max = array[i];

            }

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min + ". Max = " + max);

    }

    public static void main(String[] args) {
        double[] array1 = {1, 10.5, 88.9, -100, -88,9, 55, 12 };
        maxMin(array1);
    }
}
