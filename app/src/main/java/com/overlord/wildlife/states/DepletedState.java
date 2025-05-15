package com.overlord.wildlife.states;

import com.overlord.wildlife.DeerState;

// no resources remain, cannot interact
public class DepletedState extends DeerState {
    public DepletedState(int deerSize) {
        super(deerSize, 0);
    }

    @Override public boolean isAlive() {
        return false;
    }

    @Override public boolean isCollectible() {
        return false;
    }

    @Override
    protected DeerState copyWithRemainingFood(int newRemainingFood) {
        return this; // Depleted state always has zero food
    }

    @Override
    public CollectionResult collectFood(int requestedAmount) {
        // Nothing left to collect
        return new CollectionResult(0, this);
    }
}
