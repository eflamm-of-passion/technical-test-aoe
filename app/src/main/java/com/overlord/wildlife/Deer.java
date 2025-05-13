package com.overlord.wildlife;

public class Deer {
    private DeerState state;

    public Deer() {
        this.state = new WildState();
    }

    public void shoot() {
        this.state = this.state.shoot();
        // note : we could throw an exception if the deer is not in WildState
    }

    public int collectFood() {
        DeerStateAndFoodCollected deerStateAndFoodCollected = this.state.collect();
        this.state = deerStateAndFoodCollected.updatedDeerState();
        return deerStateAndFoodCollected.amountOfFoodCollected();
    }
}
