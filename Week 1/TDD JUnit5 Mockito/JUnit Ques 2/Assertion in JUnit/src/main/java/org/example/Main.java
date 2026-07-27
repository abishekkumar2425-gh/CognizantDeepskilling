package org.example;

public class Main {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isGreater(int a, int b) {
        return a > b;
    }

    public String getNullValue() {
        return null;
    }

    public String getMessage() {
        return "JUnit";
    }

    public static void main(String[] args) {
        Main obj = new Main();

        System.out.println("Addition: " + obj.add(2, 3));
        System.out.println("Is Greater: " + obj.isGreater(5, 3));
        System.out.println("Null Value: " + obj.getNullValue());
        System.out.println("Message: " + obj.getMessage());
    }
}