package com.scm;

public class App {
    public static void main(String[] args) {
        System.out.println("SCM CI/CD Project Running Successfully!");
        
        int result = add(2, 3);
        System.out.println("Addition Result: " + result);
    }

    // Simple method (used for testing)
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
    return a * b;
}
}