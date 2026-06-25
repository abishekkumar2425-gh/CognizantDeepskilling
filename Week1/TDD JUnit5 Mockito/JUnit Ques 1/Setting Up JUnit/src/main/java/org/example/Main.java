package org.example;

public class Main {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Main obj = new Main();

        int result = obj.add(5, 3);

        System.out.println("Sum = " + result);
    }
}
