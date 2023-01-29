package com.java.string;

public class Test3 {
    public static void main(String[] args) {
        Employee employee = new Employee(1522,  true);
        System.out.println("he is manager? " + employee.isManager + " His salary " +  employee.salary);

        int a = 5;
        String s1 = "Hello";

        String s2 = s1 + 8;
        System.out.println(s2);
    }



}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

