package com.overlord.wildlife;

public class WildState implements DeerState {

    @Override
    public boolean hunt() {
        return true;
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
