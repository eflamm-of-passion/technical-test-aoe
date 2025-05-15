package com.overlord.combat;

public interface CombatStrategy {
    public boolean isCounterOf(Unit enemyUnit);
    public Unit sendUnit();
}
