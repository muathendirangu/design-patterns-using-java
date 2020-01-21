package com.muathendirangu.creational.builder;

public class BurgerBuilder {
    protected int size;
    protected boolean cheese = false;
    protected boolean peperoni = false;
    protected boolean lettuce = false;
    protected boolean tomato = false;

    public BurgerBuilder(int size){
        this.size = size;
    }

    public void addPeperoni(){
        this.peperoni = true;
        return;
    }

    public void addCheese(){
        this.cheese = true;
        return;
    }

    public void addLettuce(){
        this.lettuce = true;
        return;
    }

    public void addTomato(){
        this.tomato = true;
        return;
    }
    public Burger build(){
        return new Burger(this);
    }

}
