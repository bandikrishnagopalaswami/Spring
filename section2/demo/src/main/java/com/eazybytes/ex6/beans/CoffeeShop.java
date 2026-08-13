package com.eazybytes.ex6.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CoffeeShop {
    @Qualifier("Cappucino")
    @Autowired
    private Coffee coffee;
    public Coffee getCoffee() {
        return coffee;
    }
}
