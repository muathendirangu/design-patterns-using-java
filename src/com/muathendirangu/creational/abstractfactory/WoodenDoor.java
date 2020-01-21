package com.muathendirangu.creational.abstractfactory;

public class WoodenDoor implements IDoor {
    @Override
    public void getDescription() {
        System.out.println("this is a wooden door");
    }
}
