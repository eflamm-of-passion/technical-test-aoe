package com.overlord.combat;

import java.util.List;

/**
 * The Strategy design patterns allow us to add strategy without modifying the Commander class
 * We can have an appropriate strategy at runtime depending on the enemy
 */

public class Commander {
    public Unit sendUnitAgainst(Unit expectedEnemyUnit) throws Exception {// TODO use the strategy to send the counter unit
        return chooseStrategyAgainst(expectedEnemyUnit);
    }

    private List<CombatStrategy> strategies = List.of(
            new ArcherStrategy(),
            new CavalryStrategy(),
            new PikemanStrategy()
    );

    private Unit chooseStrategyAgainst(Unit expectedEnemyUnit) throws Exception {
        for (CombatStrategy strategy : strategies) {
            if (strategy.isCounterOf(expectedEnemyUnit)) {
                return strategy.sendUnit();
            }
        }

        throw new Exception("There is no strategy for this unit !");
    }
}
