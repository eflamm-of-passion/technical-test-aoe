package com.overlord.wildlife;

public class WildState implements DeerState {

    private final Deer deer;

    public WildState(Deer deer) {
        this.deer = deer;
    }

    @Override
    public void shoot() {
        this.deer.nextStage();
    }

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
        return new CarcassState(this.deer);
    }
}
