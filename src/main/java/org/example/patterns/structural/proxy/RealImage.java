package org.example.patterns.structural.proxy;

public class RealImage implements Image{

    private String file;

    public RealImage(String file) {
        this.file = file;
        load(file);
    }

    @Override
    public void display() {
        System.out.println("Display " + file);
    }

    public void load(String file) {
        System.out.println("Loading " + file);
    }
}
