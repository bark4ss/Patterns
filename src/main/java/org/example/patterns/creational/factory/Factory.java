package org.example.patterns.creational.factory;

public class Factory {
    public OS getCurrentOS(String inputOs) {
        OS os = switch (inputOs) {
            case "windows" -> new WindowsOS();
            case "linux" -> new LinuxOS();
            case "mac" -> new MacOS();
            default -> null;
        };
        return os;
    }
}
