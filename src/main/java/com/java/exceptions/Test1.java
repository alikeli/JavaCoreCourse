package com.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static java.lang.System.exit;

public class Test1 {
    public static void main(String[] args) {
     //   System.out.println(ex());
     //   System.out.println(ex2());
        System.out.println(ex3());
    }


    static int ex() {

        try {
            File f = new File("Test10.txt");
            FileInputStream fis = new FileInputStream(f);
            return 1;


        } catch (FileNotFoundException e) {
            System.out.println("Exception was catch");
            return 0;
        } finally {
            System.out.println("Finaly");
        }

    }


    static int ex2() {
        int a = 5;

        try {
            File f = new File("Test10.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println(" perem = "+ a);

        } catch (FileNotFoundException e) {
            a = 10;
            System.out.println("Exception was catch");
            System.out.println(" a = " + a);
            return a;
        } finally {
            System.out.println("Finaly");
            return a;
        }

    }

    static StringBuilder ex3() {
        StringBuilder a = new StringBuilder( "Privet");

        try {
            File f = new File("Test10.txt");
            FileInputStream fis = new FileInputStream(f);
          //  System.out.println(" perem = "+ a);
           // return a;
        } catch (FileNotFoundException e) {

            System.out.println("Exception was catch");
            System.out.println(" a = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Finaly");
            System.out.println("perev in Finaly = " + a);
            return a;
        }
    }

}
