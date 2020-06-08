package com.qa.designpatterns.singletons;

import java.util.Scanner;

public class SingletonExample {
    private static SingletonExample INSTANCE;
    private int id;

    // Here is our console.
    private StringBuilder consoleLogs = new StringBuilder();
    private Scanner scanner = new Scanner(System.in);

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SingletonExample();
            INSTANCE.id = 1;
        }

        return INSTANCE;
    }

    public void write(){
        consoleLogs.append(scanner.nextLine());
    }

    public String printConsole(){
        return this.consoleLogs.toString();
    }
}
