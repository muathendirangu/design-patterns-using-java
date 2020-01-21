package com.muathendirangu.creational.abstractfactory;

public class WoodenDoorFactory implements DoorFactory {


    // Wooden factory to return carpenter and wooden door
    @Override
    public IDoor makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public IDoorFittingExpert assignFixingDoorExpert() {
        return new Carpenter();
    }
}
