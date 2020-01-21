package com.muathendirangu.behavioral.command;

public class TextFile {
    private String name;

    public TextFile(String name){
        this.name = name;
    }

    public String open(){
        return "Opening the file: " + name;
    }

    public String save(){
        return "Saving the file: " + name;
    }
}
