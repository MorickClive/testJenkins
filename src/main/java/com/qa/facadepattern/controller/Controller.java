package com.qa.facadepattern.controller;

import com.qa.facadepattern.services.CustomerService;
import com.qa.facadepattern.services.OrderService;

public class Controller {

    private CustomerService myCustomerService = null;
    private OrderService myOrderService = null;

    public Controller(){
        this.myCustomerService = new CustomerService();
        this.myOrderService = new OrderService();
    }

    public void printCustomers(){
        this.myCustomerService.method();
    }

}
