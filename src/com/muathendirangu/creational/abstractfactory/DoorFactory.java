package com.muathendirangu.creational.abstractfactory;

public interface DoorFactory {
    public IDoor makeDoor();
    public IDoorFittingExpert assignFixingDoorExpert();
}
