package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.Ferrari;

public class UsFerrariImpl implements Ferrari {
    @Override
    public long getPrice() {
        return 10000;
    }
}
