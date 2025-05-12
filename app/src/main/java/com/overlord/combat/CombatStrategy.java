package com.overlord.combat;

interface CombatStrategy {
    public boolean isCounterOf(Unit expectedEnemyUnit);
    public Unit sendUnit();
}
