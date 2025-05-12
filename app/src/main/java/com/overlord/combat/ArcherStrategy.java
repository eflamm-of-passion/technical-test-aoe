package com.overlord.combat;

class ArcherStrategy implements CombatStrategy {
    @Override
    public boolean isCounterOf(Unit expectedEnemyUnit) {
        return expectedEnemyUnit instanceof Pikeman;
    }

    @Override
    public Unit sendUnit() {
        return new Archer();
    }
}
