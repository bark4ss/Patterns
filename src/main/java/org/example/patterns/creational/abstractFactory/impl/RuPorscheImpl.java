package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.Porsche;

public class RuPorscheImpl implements Porsche {
    @Override
    public long getPrice() {
        return 15000;
    }
}
