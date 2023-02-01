package com.java.exceptions;

public class Test3 {
    public static void main(String[] args) {
        Test3 t3 = new Test3();
        try {

            t3.maraphon(40, 13);
        } catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("derzgi gramoty");
        }
    }

    void maraphon(int temperVozduxa, int tempBega) throws PodvernutNoguException{
        if (tempBega > 12) {
            throw new PodvernutNoguException("Too fast speed = "+ tempBega);
        }

        if (temperVozduxa > 32) {
            throw new SveloNoguException();
        }

        System.out.println("done it");
    }


}
class PodvernutNoguException extends Exception{
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {

    }

}

    class SveloNoguException extends RuntimeException{
        SveloNoguException(String message) {
        super(message);
        }

        SveloNoguException() {

        }

        }

