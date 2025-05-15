package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Maven");
        System.out.println("This is the simple realworld example....");

        int a = 25;
        int b = 20;
        System.out.println("Sum of " + a + " and " + b + " is " + sum(a, b));
         System.out.println("Difference of " + a + " and " + b + " is " + diff(a, b));
    }

    public static int sum(int x, int y) {
        return x + y;
    }
    public static int diff(int x, int y) {
        return x - y;
    }
}
