package com.muathendirangu.creational.abstractfactory;

public class Welder implements IDoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("I can only fit iron doors");
    }
}
