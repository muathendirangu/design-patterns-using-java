package com.muathendirangu.behavioral.mediator;

public class PowerSupply {
    private Mediator mediator;
    private boolean isOn;

    void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    void turnOn(){
        this.isOn = false;
    }

    void turnOff(){
        this.isOn = false;
    }
}
