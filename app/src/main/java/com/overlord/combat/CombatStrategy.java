package com.overlord.combat;

public interface CombatStrategy {

    boolean isEffectiveAgainst(Unit enemyUnit);

    Unit sendUnit();
}
