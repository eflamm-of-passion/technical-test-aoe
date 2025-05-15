package com.overlord.wildlife;

import com.overlord.wildlife.states.CarcassState;
import com.overlord.wildlife.states.WildState;

public class Deer {
    private DeerState state;
    private static final int DEFAULT_SIZE = 160;

    public Deer() {
        this(DEFAULT_SIZE);
    }

    public Deer(int deerSize) {
        state = new WildState(deerSize);
    }

    /**
     * Shoots the deer, as the hunter is the best of the Middle-earth, one shot is enough
     * transition the deer from wild to carcass state if alive
     */
    public void shoot() {
        if (state.isAlive()) {
            state = new CarcassState(state.getDeerSize());
        }
    }

    public int collectFood() {
        if (!state.isCollectible()) {
            return 0;
        }

        DeerState.CollectionResult result = state.collectFood(state.getDeerSize() / 4);
        state = result.nextState();

        return result.collectedAmount();
    }

    public DeerState getState() {
        return state;
    }

    public boolean isAlive() {
        return state.isAlive();
    }

    public boolean isCollectible() {
        return state.isCollectible();
    }
}
