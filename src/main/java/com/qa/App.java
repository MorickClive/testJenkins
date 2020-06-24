package com.qa;

import com.qa.designpatterns.decorator.Pizza;
import com.qa.designpatterns.decorator.impl.PizzaDecorator;
import com.qa.designpatterns.decorator.impl.PizzaImpl;
import com.qa.designpatterns.decorator.impl.decorations.Cheese;
import com.qa.designpatterns.decorator.impl.decorations.Mushrooms;
import com.qa.designpatterns.decorator.impl.decorations.Sauce;
import com.qa.designpatterns.singletons.SingletonExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Uncomment methods to test design patterns

        // Decorator pattern
        //singletons();

        // Decorator pattern
        //decorator();

    }

    // The Singleton pattern
    public static void singletons(){

        // Example 1
        // Here we ask our Singleton of which contains our scanner, to read and store our input
        SingletonExample singleton = SingletonExample.getInstance();

        // Here we scan in our input for the singleton to store in its console logs.
        System.out.println("Please enter a value:\n");
        singleton.write();

        System.out.println("Singleton: " + singleton.consoleOutput());

        // Example 2
        // Even if we try to get another instance, we simply gain our original instance back.
        // This is proved by the identical return of the consoleOutput!
        SingletonExample singleton1 = SingletonExample.getInstance();
        System.out.println("Singleton1: " + singleton1.consoleOutput());
    }


    // The Decorator pattern
    public static void decorator(){
        Pizza ourPizza = new PizzaImpl();

        ourPizza = new Mushrooms(ourPizza);
        ourPizza = new Sauce(ourPizza);
        ourPizza = new Cheese(ourPizza);

        System.out.println(ourPizza.decorate() + ".");
    }



}
