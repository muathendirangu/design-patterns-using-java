package com.muathendirangu.behavioral.mediator;

public class Fan {
    public boolean isOn;
    private Mediator mediator;

    void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    void press(){
        this.mediator.press();
    }

    void turnOff() {
        this.isOn = false;
    }

    void turnOn() {
        this.isOn = true;
    }
}
