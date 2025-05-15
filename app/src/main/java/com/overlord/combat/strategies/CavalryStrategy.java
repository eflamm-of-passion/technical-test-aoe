package com.overlord.combat.strategies;

import com.overlord.combat.units.Archer;
import com.overlord.combat.CombatStrategy;
import com.overlord.combat.units.Horseman;
import com.overlord.combat.Unit;

public class CavalryStrategy implements CombatStrategy {
    @Override
    public boolean isCounterOf(Unit expectedEnemyUnit) {
        return expectedEnemyUnit instanceof Archer;
    }

    @Override
    public Unit sendUnit() {
        return new Horseman();
    }
}
