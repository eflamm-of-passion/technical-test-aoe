package com.overlord.combat;

public class PikemanStrategy implements CombatStrategy {
    @Override
    public boolean isCounterOf(Unit expectedEnemyUnit) {
        return expectedEnemyUnit instanceof Cavalry;
    }

    @Override
    public Unit sendUnit() {
        return new Pikeman();
    }
}
