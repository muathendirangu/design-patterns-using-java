package com.muathendirangu.creational.factory;

abstract class HiringManager {
    abstract protected Interviewer assignInterviewer();

    public void conductInterview() {
        var interviewer = this.assignInterviewer();
        interviewer.askQuestions();
    }
}
