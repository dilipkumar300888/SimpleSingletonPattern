package org.example;

public class Singleton {

    // Step 1: Create a private static variable to hold the single instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation from other classes
    private Singleton() {
        // Private constructor
    }

    // Step 3: Provide a public static method to get the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Create instance if it doesn't exist
        }
        return instance;
    }

    // Example method in the Singleton class
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
