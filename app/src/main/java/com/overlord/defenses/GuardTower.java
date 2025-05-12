package com.overlord.defenses;

public class GuardTower {
    private Weapon weapon;

    public GuardTower(Weapon weapon) {
        this.weapon = weapon;
    }

    /**
     * @return the projectile that was fired (virtually speaking)
     */
    public String fire() {
        return this.weapon.fire();
    }

    public void upgradeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
