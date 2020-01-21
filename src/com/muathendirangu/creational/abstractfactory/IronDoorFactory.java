package com.muathendirangu.creational.abstractfactory;

public class IronDoorFactory implements DoorFactory {
    // Iron door factory to get iron door and the relevant fitting expert
    @Override
    public IDoor makeDoor() {
        return new IronDoor();
    }

    @Override
    public IDoorFittingExpert assignFixingDoorExpert() {
        return new Welder();
    }
}
