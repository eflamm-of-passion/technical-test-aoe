package com.overlord.wildlife;

public class CarcassState implements DeerState {

    private Deer deer;
    private int remainingFood;

    public CarcassState(Deer deer) {
        this.deer = deer;
        this.remainingFood = 100;
    }


    @Override
    public void shoot() {}

    @Override
    public int collect() {
        int collectedFood;
        if(canCollect()) {
            collectedFood = 25;
            this.remainingFood -= collectedFood;
        } else {
            // note : or it could throw an exception
            collectedFood = 0;
        }
        whenLastPiece();
        return collectedFood;
    }

    private void whenLastPiece() {
        if(this.remainingFood == 0) {
            this.deer.nextStage();
        }
    }

    @Override
    public boolean canCollect() {
        return this.remainingFood >= 25;
    }

    @Override
    public DeerState nextStage() {
        return new DepletedState();
    }
}
