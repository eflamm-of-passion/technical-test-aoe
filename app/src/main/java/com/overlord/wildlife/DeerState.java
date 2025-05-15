package com.overlord.wildlife;

public abstract class DeerState {
    private final int deerSize;
    private final int remainingFood;

    protected DeerState(int deerSize, int remainingFood) {
        this.deerSize = deerSize;
        this.remainingFood = remainingFood;
    }

    public abstract boolean isAlive();

    public abstract boolean isCollectible();

    public abstract CollectionResult collectFood(int requestedAmount);

    protected abstract DeerState copyWithRemainingFood(int newRemainingFood);

    public int getDeerSize() {
        return deerSize;
    }

    public int getRemainingFood() {
        return remainingFood;
    }

    /**
     * Immutable result of a food collection operation containing the
     * amount collected and the resulting state.
     *
     * @param collectedAmount the amount of food collected
     * @param nextState the resulting state after collection
     */
    public record CollectionResult(int collectedAmount, DeerState nextState) {}
}
