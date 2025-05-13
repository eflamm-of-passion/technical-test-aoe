package com.overlord.wildlife;

public class DepletedState implements DeerState {

    @Override
    public DeerState shoot() {
        return this;
    }

    @Override
    public DeerStateAndFoodCollected collect() {
        return new DeerStateAndFoodCollected(this, 0);
    }

    private DeerState nextStage() {
        return this; // note : or throw an exception
    }
}
