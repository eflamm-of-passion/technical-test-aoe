package com.overlord.combat;

public class ArcherStrategy implements CombatStrategy{

    @Override
    public boolean isEffectiveAgainst(Unit enemyUnit) {
        return enemyUnit instanceof Pikeman;
    }

    @Override
    public Unit sendUnit() {
        return new Archer();
    }
}
