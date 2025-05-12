package com.overlord.wildlife;

public class DepletedState implements DeerState {

    @Override
    public void shoot() {}

    @Override
    public int collect() {
        return 0;
    }

    @Override
    public boolean canCollect() {
        return false;
    }

    @Override
    public DeerState nextStage() {
        return new DepletedState(); // note : or throw an exception
    }
}
