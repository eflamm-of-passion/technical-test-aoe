package com.overlord.defenses;

import com.overlord.defenses.weapons.Ballista;

public class GuardTower {
    private IWeapon weapon;

    /**
     * Constructor to create a GuardTower with a specific weapon.
     *
     * @param weapon the weapon to be used by the GuardTower
     */
    public GuardTower(IWeapon weapon) {
        this.weapon = weapon;
    }

    /**
     * Default constructor to create a GuardTower with a default weapon (Ballista).
     */
    public GuardTower() {
        this.weapon = new Ballista();
    }

    /**
     * @return the projectile that was fired (virtually speaking)
     */
    public String fire(String target) {
        return this.weapon.fire(target);
    }

    /**
     * @param newWeapon the new weapon to be used
     */
    public void switchWeapon(IWeapon newWeapon) {
        this.weapon = newWeapon;
    }
}
