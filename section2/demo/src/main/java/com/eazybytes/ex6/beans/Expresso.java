package com.eazybytes.ex6.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Expresso")
@Primary
public class Expresso implements Coffee{
    @Override
    public String makeCoffee(){
        return "expresso";
    }
}
