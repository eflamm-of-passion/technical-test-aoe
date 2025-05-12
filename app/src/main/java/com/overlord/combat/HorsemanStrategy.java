package com.overlord.combat;

public class HorsemanStrategy implements CombatStrategy{

    @Override
    public boolean isEffectiveAgainst(Unit enemyUnit) {
        return enemyUnit instanceof Archer;
    }

    @Override
    public Unit sendUnit() {
        return new Horseman();
    }
}
