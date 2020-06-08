package com.qa.designpatterns.decorator.impl;

import com.qa.designpatterns.decorator.Pizza;

public class PizzaImpl implements Pizza {

    @Override
    public String decorate(){
        return "My pizza base";
    }
}
