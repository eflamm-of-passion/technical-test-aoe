package com.overlord.defenses;

import com.overlord.defenses.weapons.Ballista;
import com.overlord.defenses.weapons.Cannon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuardTowerTest {
    @Test
    void build_your_defenses() {
        // given
        Ballista ballista = new Ballista();
        String target = "vile goblin";

        // when
        // construct your tower with a ballista
        GuardTower tower = new GuardTower(ballista);
        // upgrade your tower with a cannon
        tower.switchWeapon(new Cannon());

        // fire some deadly projectile
        String actualProjectile = tower.fire(target);

        // then
        // check that a cannonball has been fired
        assertEquals(String.format("cannonball fired at %s", target), actualProjectile);
    }
}