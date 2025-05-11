package com.overlord.wildlife;

public class Deer {
    private String state;
    private int remaingAmountOfFood;

    public Deer() {
        this.state = "living";
        this.remaingAmountOfFood = 100; // FIXME probably should be in the state
    }

    public void shoot() {
        // TODO if the deer is living, then change state to carcass
    }

    public int collectFood() {
        // TODO collect only when deer is in carcass state
        // TODO swap to depleted state when there is no remaining food
        int amountCollected = 25;
        this.remaingAmountOfFood -= amountCollected;
        return amountCollected;
    }

    // TODO implement the states of the Deer : living, carcass, depleted
}
