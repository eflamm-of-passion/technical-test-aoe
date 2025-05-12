package com.overlord.wildlife;

public class Deer {
    private DeerState state;

    public Deer() {
        this.state = new WildState(this);
    }

    protected void nextStage() {
        this.state = this.state.nextStage();
    }

    public void shoot() {
        this.state.shoot();
        // note : we could throw an exception if the deer is not in WildState
    }

    public int collectFood() {
        return this.state.collect();
    }
}
