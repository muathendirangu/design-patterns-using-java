package com.muathendirangu.structural.decorator;

public class DecorateWIthBubbleLights extends ChristmasTreeDecorator {
    public DecorateWIthBubbleLights(ChristmasTree christmasTree){
        super(christmasTree);
    }

    @Override
    public String Decorate() {
        return super.Decorate() + decorateWithBubbleLights();
    }

    private String decorateWithBubbleLights(){
        return ", then add bubble lights";
    }
}
