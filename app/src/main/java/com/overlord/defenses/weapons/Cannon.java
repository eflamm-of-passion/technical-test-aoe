package com.overlord.defenses.weapons;

import com.overlord.defenses.IWeapon;

/**
 * The Cannon class implements the IWeapon interface and represents a cannon weapon.
 * It provides a method to fire a cannonball at a specified target.
 */
public class Cannon implements IWeapon {
    public String fire(String target) {
        return String.format("cannonball fired at %s", target);
    }
}
