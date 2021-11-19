package org.example.patterns.creational.factory;

public class LinuxOS implements OS{
    @Override
    public void getOS() {
        System.out.println("Linux");
    }
}
