package org.example.patterns.structural.facade;

public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.start();
        System.out.println();
        facade.stop();
    }
}
