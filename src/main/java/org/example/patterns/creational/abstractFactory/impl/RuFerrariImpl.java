package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.Ferrari;

public class RuFerrariImpl implements Ferrari {
    @Override
    public long getPrice() {
        return 50000;
    }
}
