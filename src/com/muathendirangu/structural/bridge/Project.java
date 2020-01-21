package com.muathendirangu.structural.bridge;

public class Project implements WebPage {

    protected Theme theme;

    public Project(Theme theme){
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Project page color in: " + this.theme.getColor();
    }
}
