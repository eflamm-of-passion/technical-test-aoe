package com.overlord.wildlife;

public interface DeerState {
    /**
     * @return the same state, or the next state to be updated by the Deer
     */
    DeerState shoot();

    /**
     * @return the same state, or the next state to be updated by the Deer, and the amount of food collected
     */
    DeerStateAndFoodCollected collect();
}
