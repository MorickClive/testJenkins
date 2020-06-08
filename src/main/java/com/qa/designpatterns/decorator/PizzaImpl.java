package com.qa.designpatterns.decorator;

public class PizzaImpl implements Pizza {

    @Override
    public String decorate(){
        return "My pizza base";
    }
}
