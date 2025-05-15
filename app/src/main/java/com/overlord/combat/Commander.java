package com.overlord.combat;

import java.util.Set;

public class Commander {
    Set<CombatStrategy> knownCombatStrategies;

    public Commander(Set<CombatStrategy> knownCombatStrategies) {
        this.knownCombatStrategies = knownCombatStrategies;
    }

    public Unit sendUnitAgainst(Unit expectedEnemy) {
        CombatStrategy bestStrategy = chooseStrategyAgainst(expectedEnemy);
        return bestStrategy.sendUnit();
    }

    private CombatStrategy chooseStrategyAgainst(Unit expectedEnemy) {
        return knownCombatStrategies.stream()
                                    .filter(strategy -> strategy.isCounterOf(expectedEnemy))
                                    .findFirst()
                                    .orElseThrow(() -> new IllegalArgumentException("No strategy found against: " + expectedEnemy));
    }
}
