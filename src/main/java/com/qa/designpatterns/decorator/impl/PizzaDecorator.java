package com.qa.designpatterns.decorator.impl;

import com.qa.designpatterns.decorator.Pizza;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    /**
     * Desc:
     * This is the abstract constructor, a child object will utilise this.
     *
     * @param pizza This is your Pizza related object
     */
    protected PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String decorate(){
        return pizza.decorate();
    }

}