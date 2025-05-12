package com.overlord.wildlife;

public class CarcassState implements DeerState {
    private final Deer deer;

    public CarcassState(Deer deer) {
        this.deer = deer;
    }

    @Override
    public boolean hunt() {
        return false;
    }

    @Override
    public int collect() {
        int currentRemainingMeat = deer.getRemainingAmountOfFood();
        if (currentRemainingMeat > 0) {
            int amountCollected = 25;
            deer.setRemainingAmountOfFood(currentRemainingMeat - amountCollected);
            if (deer.getRemainingAmountOfFood() <= 0) {
                deer.setState(new DepletedState());
            }
            return amountCollected;
        }
        return 0;
    }

    @Override
    public boolean canCollect() {
        return deer.getRemainingAmountOfFood() > 0;
    }
}
