package com.muathendirangu.creational.abstractfactory;

public class IronDoor implements IDoor {
    @Override
    public void getDescription() {
        System.out.println("this is an iron door");
    }
}
