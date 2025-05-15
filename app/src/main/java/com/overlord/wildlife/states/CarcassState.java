package com.overlord.wildlife.states;

import com.overlord.wildlife.DeerState;

// fresh kill, meat can be collected
public class CarcassState extends DeerState {
    private static final double EDIBLE_PORTION_RATIO = 0.48; // According to deerassociation.com

    public CarcassState(int deerSize) {
        super(deerSize, calculateInitialFoodAmount(deerSize));
    }

    private static int calculateInitialFoodAmount(int deerSize) {
        return (int) (deerSize * EDIBLE_PORTION_RATIO);
    }

    @Override public boolean isAlive() {
        return false;
    }

    @Override public boolean isCollectible() {
        return true;
    }

    @Override
    protected DeerState copyWithRemainingFood(int newRemainingFood) {
        return new CarcassState(getDeerSize()) {
            @Override
            public int getRemainingFood() {
                return newRemainingFood;
            }
        };
    }

    @Override
    public CollectionResult collectFood(int requestedAmount) {
        int actualCollection = Math.min(requestedAmount, getRemainingFood());
        int remaining = getRemainingFood() - actualCollection;

        if (remaining <= 0) {
            return new CollectionResult(actualCollection, new DepletedState(getDeerSize()));
        }

        return new CollectionResult(actualCollection, copyWithRemainingFood(remaining));
    }
}
