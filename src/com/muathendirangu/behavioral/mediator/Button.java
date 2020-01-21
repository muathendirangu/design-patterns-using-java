package com.muathendirangu.behavioral.mediator;

public class Button {
    private Mediator mediator;

    void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    void press(){
        this.mediator.press();
    }
}
