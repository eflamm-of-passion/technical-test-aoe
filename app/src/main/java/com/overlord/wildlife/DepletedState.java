package com.overlord.wildlife;

public class DepletedState implements DeerState {

    @Override
    public boolean hunt() {
        return false;
    }

    @Override
    public int collect() {
        return 0;
    }

    @Override
    public boolean canCollect() {
        return false;
    }
}
