package com.overlord.defenses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardTowerTest {

    @Test
    public void build_your_defenses() {
        // when
        // TODO construct your tower with a ballista (the ballista is the default weapon in the constructor)
        GuardTower tower = new GuardTower();
        // TODO upgrade your tower with a cannon
        Cannon cannon = new Cannon();
        tower.setWeapon(cannon);
        // TODO fire some deadly projectile
        String actualProjectile = tower.fire();

        // then
        // TODO check that a cannonball has been fired
        assertEquals("cannonball fired", actualProjectile);
    }

}