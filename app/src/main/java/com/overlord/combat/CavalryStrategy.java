package com.overlord.combat;

public class CavalryStrategy implements CombatStrategy{
    @Override
    public boolean isCounterOf(Unit expectedEnemyUnit) {
        return  expectedEnemyUnit instanceof Archer;
    }

    @Override
    public Unit sendUnit() {
        return new Cavalry();
    }
}
