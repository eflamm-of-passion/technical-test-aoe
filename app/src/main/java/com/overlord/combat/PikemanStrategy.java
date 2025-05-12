package com.overlord.combat;

public class PikemanStrategy implements CombatStrategy{

    @Override
    public boolean isEffectiveAgainst(Unit enemyUnit) {
        return enemyUnit instanceof Horseman;
    }

    @Override
    public Unit sendUnit() {
        return new Pikeman();
    }
}
