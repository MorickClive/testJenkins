package com.qa.designpatterns.decorator.impl;

import com.qa.designpatterns.decorator.Pizza;

public abstract class PizzaDecorator implements Pizza {

    private Pizza pizza;

    protected PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    public String decorate(){
        return pizza.decorate();
    }

}