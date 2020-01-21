package com.muathendirangu.creational.singleton;

public final class President {

    private static class InstanceHolder{
        private static final President INSTANCE = new President();
    }
    private President(){}

    public static President getInstance(){
        return InstanceHolder.INSTANCE;
    }
}
