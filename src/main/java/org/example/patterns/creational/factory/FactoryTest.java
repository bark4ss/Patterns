package org.example.patterns.creational.factory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        String osLine = "mac";
        OS os = factory.getCurrentOS(osLine);
        os.getOS();
    }
}
