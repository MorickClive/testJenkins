package com.qa.designpatterns.singletons;

import java.util.Scanner;

public class SingletonExample {

    private static SingletonExample INSTANCE = null;

    // Here is our console.
    private StringBuilder consoleLogs = new StringBuilder();
    private Scanner scanner;

    private SingletonExample() {
    }

    // Create the only instance of this class and then return the only instance of this class.
    // Ensure it does not create a new instance if an instance already exists.
    public static SingletonExample getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonExample();
        }
        return INSTANCE;
    }

    public void write(){
        this.scanner = new Scanner(System.in);

        consoleLogs.append(scanner.nextLine());

        scanner.close();
    }

    public String consoleOutput(){
        return this.consoleLogs.toString();
    }
}
