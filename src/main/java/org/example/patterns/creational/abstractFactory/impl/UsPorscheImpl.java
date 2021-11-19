package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.Porsche;

public class UsPorscheImpl implements Porsche {
    @Override
    public long getPrice() {
        return 3000;
    }
}
