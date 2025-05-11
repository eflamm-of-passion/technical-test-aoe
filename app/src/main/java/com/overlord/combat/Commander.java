package com.overlord.combat;

public class Commander {

    public Unit sendUnitAgainst(Unit expectedEnemy) {
        // TODO use the strategy to send the counter unit
        chooseStrategyAgainst(expectedEnemy);
        return new Pikeman(); // FIXME
    }

    private void chooseStrategyAgainst(Unit expectedEnemy) {
        // TODO implement the three possible strategies using the strategy design pattern
        // TODO you should return the proper strategy to send
    }
}
