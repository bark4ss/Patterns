package org.example.patterns.structural.adapter.impl;

import org.example.patterns.structural.adapter.MoveAble;

public class LadaMoveAbleImpl implements MoveAble {
    @Override
    public int getSpeed() {
        return 120;
    }
}
