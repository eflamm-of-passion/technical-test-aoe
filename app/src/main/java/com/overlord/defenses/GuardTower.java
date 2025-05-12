package com.overlord.defenses;

/**
 * The Dependency Injection allows our Class to "receive" a dependency (here the Weapon),
 * instead of creating it internally.
 * By injecting the dependency externally, we improve flexibility and testability,
 * while also respecting the SRP.
 *
 * Here the GuardTower delegates the attack logic to its weapon,
 * we can also switch the weapon without changing the GuardTower code
 */

public class GuardTower {
    private Weapon weapon;

    public GuardTower() {
        this.weapon = new Ballista();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String fire() {
        return this.weapon.fire();
    }
}
