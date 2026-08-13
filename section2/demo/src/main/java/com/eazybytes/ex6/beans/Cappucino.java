package com.eazybytes.ex6.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Qualifier("Cappucino")
public class Cappucino implements Coffee{
    @Override
    public String makeCoffee(){
        return "cappucino";
    }
}
