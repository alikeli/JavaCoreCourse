package com.java.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {

    static void ex() {

        try {
            File f = new File("Test10.txt");
            FileInputStream fis = new FileInputStream(f);

        } catch (FileNotFoundException e) {
            System.out.println("Exception was catch");

        } finally {
            System.out.println("Finaly");
        }

    }


}
