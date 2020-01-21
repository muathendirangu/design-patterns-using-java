package com.muathendirangu.structural.bridge;

public class Career implements WebPage {

    protected Theme theme;

    public Career(Theme theme){
        this.theme = theme;
    }

    @Override
    public String getContent() {
        return "Careers page in: " + this.theme.getColor();
    }
}
