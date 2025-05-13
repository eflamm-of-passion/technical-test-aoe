package com.overlord.wildlife;

public class CarcassState implements DeerState {

    private int remainingFood;

    public CarcassState() {
        this.remainingFood = 100;
    }


    @Override
    public DeerState shoot() {
        return this;
    }

    @Override
    public DeerStateAndFoodCollected collect() {
        int collectedFood;
        if(canCollect()) {
            collectedFood = cutASteak();
        } else {
            // note : or it could throw an exception
            collectedFood = doNothing();
        }
        DeerState updatedState = whenLastPiece();
        return new DeerStateAndFoodCollected(updatedState, collectedFood);
    }

    private int cutASteak() {
        int collectedFood = 25;
        this.remainingFood -= collectedFood;
        return collectedFood;
    }

    private int doNothing() {
        return 0;
    }

    private DeerState whenLastPiece() {
        return this.remainingFood == 0 ? this.nextStage() : this;
    }

    private boolean canCollect() {
        return this.remainingFood >= 25;
    }

    private DeerState nextStage() {
        return new DepletedState();
    }
}
