package com.eazybytes.ex6;

import com.eazybytes.ex6.Config.*;
import com.eazybytes.ex6.beans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.*;
import java.util.stream.Collectors;

public class DemoClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfig.class);
        CoffeeShop coffeeShop=(context.getBean(CoffeeShop.class));
//        Coffee coffee=coffeeShop.getCoffee();
      System.out.println(coffeeShop.getCoffee().makeCoffee());

    }
}
