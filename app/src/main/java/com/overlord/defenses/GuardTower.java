package com.overlord.defenses;

public class GuardTower {
    private Ballista weapon;

    public GuardTower() {
        this.weapon = new Ballista();
    }

    /**
     * @return the projectile that was fired (virtually speaking)
     */
    public String fire() {
        return this.weapon.fire();
    }

    // TODO implement modular weapon system
}
