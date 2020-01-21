package com.muathendirangu.behavioral.mediator;

public class Mediator {
   private Button button;
   private Fan fan;
   private PowerSupply powerSupply;

    public void setButton(Button button) {
        this.button = button;
        this.button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        this.fan.setMediator(this);
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
        this.powerSupply.setMediator(this);
    }

    void press(){
        if (fan.isOn){
            fan.turnOff();
        }else {
            fan.turnOn();
        }
    }

    void start(){
        powerSupply.turnOn();
    }
    void  stop(){
        powerSupply.turnOff();
    }
}
