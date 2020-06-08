package com.qa;

import com.qa.designpatterns.decorator.Pizza;
import com.qa.designpatterns.decorator.PizzaImpl;
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
        // Singleton pattern
        singletons();

    }

    // The Singleton pattern
    public static void singletons(){
        //Singleton
        SingletonExample singleton = SingletonExample.getInstance();

        //System.out.print("Please enter a value:\n");
        //singleton.write();

        System.out.println(singleton.printConsole());
    }

    // The Decorator pattern
    public static void decorator(){
        Pizza ourPizza = new PizzaImpl();

        //ourPizza = new Sauce(ourPizza);
        //ourPizza = new Cheese(ourPizza);
        //ourPizza = new Mushrooms(ourPizza);

        System.out.println(ourPizza.decorate() + ".");
    }
}
