package com.qa;

import com.qa.designpatterns.decorator.Pizza;
import com.qa.designpatterns.decorator.PizzaImpl;
import com.qa.designpatterns.decorator.impl.decorations.Cheese;
import com.qa.designpatterns.decorator.impl.decorations.Mushrooms;
import com.qa.designpatterns.decorator.impl.decorations.Sauce;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Cat cat1 = new Cat("Boris", 15, "Patchy, Black & White");

        Pizza ourPizza = new Sauce(new PizzaImpl());

        ourPizza = new Sauce(ourPizza);
        ourPizza = new Cheese(ourPizza);
        ourPizza = new Mushrooms(ourPizza);

        System.out.println(ourPizza.decorate() + ".");
    }
}
