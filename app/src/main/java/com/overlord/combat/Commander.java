package com.overlord.combat;

import java.util.HashSet;
import java.util.Set;

public class Commander {

    Set<CombatStrategy> knownCombatStrategies = new HashSet<>();

    public Commander() {
        this.knownCombatStrategies.add(new ArcherStrategy());
        this.knownCombatStrategies.add(new PikemanStrategy());
        this.knownCombatStrategies.add(new HorsemanStrategy());
    }

    public Unit sendUnitAgainst(Unit expectedEnemy) {
        CombatStrategy bestStrategy = chooseStrategyAgainst(expectedEnemy);
        return bestStrategy.sendUnit();
    }

    private CombatStrategy chooseStrategyAgainst(Unit expectedEnemy) {
        return knownCombatStrategies.stream()
                .filter(strategy -> strategy.isEffectiveAgainst(expectedEnemy))
                .findFirst().get(); // note : beware this is not null safe
    }
}
