package com.muathendirangu.creational.factory;

public class Developer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Ask questions about design patterns");
    }
}
