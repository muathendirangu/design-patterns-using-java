package com.muathendirangu.structural.decorator;

public abstract class ChristmasTreeDecorator implements ChristmasTree {
    private ChristmasTree christmasTree;

    public ChristmasTreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String Decorate() {
        return christmasTree.Decorate();
    }
}
