package com.overlord.combat.strategies;

import com.overlord.combat.units.Archer;
import com.overlord.combat.CombatStrategy;
import com.overlord.combat.units.Pikeman;
import com.overlord.combat.Unit;

public class ArcherStrategy implements CombatStrategy {
    @Override
    public boolean isCounterOf(Unit expectedEnemyUnit) {
        return expectedEnemyUnit instanceof Pikeman;
    }

    @Override
    public Unit sendUnit() {
        return new Archer();
    }
}
