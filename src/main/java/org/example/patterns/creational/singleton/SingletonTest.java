package org.example.patterns.creational.singleton;

import org.example.patterns.creational.singleton.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setUp();
    }
}
