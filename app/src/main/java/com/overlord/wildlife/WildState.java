package com.overlord.wildlife;

public class WildState implements DeerState {

    public WildState() {}

    @Override
    public DeerState shoot() {
        return this.nextStage();
    }

    @Override
    public DeerStateAndFoodCollected collect() {
        return new DeerStateAndFoodCollected(this, 0);
    }


    private DeerState nextStage() {
        return new CarcassState();
    }
}
