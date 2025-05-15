package com.overlord.wildlife.states;

import com.overlord.wildlife.DeerState;

// deer is alive, can be hunted, no collection
public class WildState extends DeerState {
    public WildState(int deerSize) {
        super(deerSize, 0); // No food available yet
    }

    @Override public boolean isAlive() {
        return true;
    }

    @Override public boolean isCollectible() {
        return false;
    }

    @Override
    protected DeerState copyWithRemainingFood(int newRemainingFood) {
        return new WildState(getDeerSize());
    }

    @Override
    public CollectionResult collectFood(int requestedAmount) {
        // deer is alive, nothing to collect
        return new CollectionResult(0, this);
    }
}
