package com.overlord.defenses;

public interface IWeapon {
    /**
     * @return the projectile that was fired (virtually speaking)
     */
    String fire(String target);
}
