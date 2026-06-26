package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition = " + c.add(10, 5));
        System.out.println("Subtraction = " + c.subtract(10, 5));
    }
}
