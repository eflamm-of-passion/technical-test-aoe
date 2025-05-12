package com.overlord.defenses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardTowerTest {

    @Test
    public void build_your_defenses() {
        // given
        Ballista ballista = new Ballista();

        // when
        // consctruct your tower with a ballista
        GuardTower tower = new GuardTower(ballista);

        // upgrade your tower with a cannon
        Cannon cannon = new Cannon();
        tower.upgradeWeapon(cannon);

        // fire some deadly projectile
        String actualProjectile = tower.fire();

        // then
        // check that a cannonball has been fired
        assertEquals("cannonball fired", actualProjectile);
    }

}