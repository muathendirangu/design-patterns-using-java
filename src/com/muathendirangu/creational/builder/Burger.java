package com.muathendirangu.creational.builder;

public class Burger {
    protected int size;
    protected boolean cheese = false;
    protected boolean peperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    Burger(BurgerBuilder burgerBuilder){
        this.size = burgerBuilder.size;
        this.cheese = burgerBuilder.cheese;
        this.lettuce = burgerBuilder.lettuce;
        this.peperoni = burgerBuilder.lettuce;
        this.tomato = burgerBuilder.tomato;
    }
}
