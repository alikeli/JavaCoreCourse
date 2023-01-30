package com.java.abstractClass;

public class Test1 {
    public static void main(String[] args) {

    }


    abstract class Figura {
        int valueOfSide = 0;

        abstract void perimeter();

        abstract void area();

        void showInfo() {
            System.out.println("It's figura");
        }


    }

    class Kvadrat extends Figura {
        int valueOfSide = 4;
        int side = 10;

        @Override
        void perimeter() {

            System.out.println("Perimeter kv = " + side * 4);
        }

        @Override
        void area() {
            int side = 10;
            System.out.println("area kv= " + side * side);

        }
    }

    class Pryamougolnik extends Figura {
        int valueOfSide = 4;
        int side = 18;
        int side2 = 14;

        @Override
        void perimeter() {

            System.out.println("Perimeter pr= " + (side + side2) * 2);
        }

        @Override
        void area() {
            System.out.println("area pr = " + side * side2);

        }
    }


}
