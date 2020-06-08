package com.qa.designpatterns.decorator.impl.decorations;

import com.qa.designpatterns.decorator.Pizza;
import com.qa.designpatterns.decorator.impl.PizzaDecorator;

public class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String decorate(){
        return super.decorate() + "; with cheese";
    }
}
