package com.muathendirangu.creational.factory;

public class Designer implements Interviewer {
    @Override
    public void askQuestions(){
        System.out.println("Ask system product design questions");
    }
}
