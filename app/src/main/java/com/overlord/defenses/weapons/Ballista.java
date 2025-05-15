package com.overlord.defenses.weapons;

import com.overlord.defenses.IWeapon;

// Some folks like to prefix their interfaces with an "I" to indicate that they are interfaces.
// I have little to no opinion on this, and usually follow conventions of the codebase I'm working on.

/**
 * The Ballista class implements the IWeapon interface and represents a ballista weapon.
 * It provides a method to fire a bolt at a specified target.
 */
public class Ballista implements IWeapon {

    public String fire(String target) {
        return String.format("bolt fired at %s", target);
    }
}
