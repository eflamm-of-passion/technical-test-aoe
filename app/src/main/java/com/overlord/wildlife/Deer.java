package com.overlord.wildlife;

/**
 * If an object's behavior depends on its state and needs to change dynamically at runtime based on state transitions,
 * we should consider using the State pattern
 */

public class Deer {
    private DeerState currentState;
    private int remainingAmountOfFood;

    public Deer() {
        setRemainingAmountOfFood(100);
        currentState = new WildState();
    }

    public void setState(DeerState state) {
        this.currentState = state;
    }

    public void shoot() {
        // TODO if the deer is living, then change state to carcass
        if(currentState.hunt()){
            currentState = new CarcassState(this);
        }
    }

    public int collectFood() {
        // TODO collect only when deer is in carcass state
        // TODO swap to depleted state when there is no remaining food -> Done in the CarcassState.collect
        return this.currentState.canCollect() ? this.currentState.collect() : 0;
    }

    public int getRemainingAmountOfFood() {
        return remainingAmountOfFood;
    }

    public void setRemainingAmountOfFood(int remainingAmountOfFood) {
        this.remainingAmountOfFood = remainingAmountOfFood;
    }
}
