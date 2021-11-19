package org.example.patterns.structural.facade;

import org.example.patterns.structural.facade.impl.Engine;
import org.example.patterns.structural.facade.impl.Key;

public class Facade {
    private Key key;
    private Engine engine;

    public Facade() {
        key = new Key();
        engine = new Engine();
    }

    public void start() {
        key.start();
        engine.start();
    }

    public void stop() {
        key.stop();
        engine.stop();
    }
}
