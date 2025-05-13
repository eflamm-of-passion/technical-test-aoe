package com.overlord.combat.strategies;

import com.overlord.combat.CombatStrategy;
import com.overlord.combat.units.Horseman;
import com.overlord.combat.units.Pikeman;
import com.overlord.combat.Unit;

public class PikemanStrategy implements CombatStrategy {
    @Override
    public boolean isCounterOf(Unit expectedEnemyUnit) {
        return expectedEnemyUnit instanceof Horseman;
    }

    @Override
    public Unit sendUnit() {
        return new Pikeman();
    }
}
