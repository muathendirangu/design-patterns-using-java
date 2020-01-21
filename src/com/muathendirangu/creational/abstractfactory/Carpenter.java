package com.muathendirangu.creational.abstractfactory;

public class Carpenter implements IDoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("I fit and fix only wooden doors");
    }
}
