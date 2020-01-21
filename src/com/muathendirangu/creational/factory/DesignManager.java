package com.muathendirangu.creational.factory;

public class DesignManager extends HiringManager {
    @Override
    protected Interviewer assignInterviewer() {
        return new Designer();
    }
}
