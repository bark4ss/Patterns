package org.example.patterns.creational.abstractFactory.impl;

import org.example.patterns.creational.abstractFactory.Lada;

public class RuLadaImpl implements Lada {
    @Override
    public long getPrice() {
        return 5000;
    }
}
