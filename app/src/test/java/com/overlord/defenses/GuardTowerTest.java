package com.overlord.defenses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardTowerTest {

    @Test
    public void build_your_defenses() {
        // given
        Ballista ballista = new Ballista();

        // when
        // TODO consctruct your tower with a ballista
        GuardTower tower = new GuardTower();
        // TODO upgrade your tower with a cannon
        // TODO fire some deadly projectile
        String actualProjectile = "";

        // then
        // TODO check that a cannonball has been fired
        assertEquals("cannonball fired", actualProjectile);
    }

}