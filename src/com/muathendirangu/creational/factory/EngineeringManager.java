package com.muathendirangu.creational.factory;

public class EngineeringManager extends HiringManager {
    @Override
    protected Interviewer assignInterviewer() {
        return new Developer();
    }
}
