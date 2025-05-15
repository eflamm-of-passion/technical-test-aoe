package com.overlord.wildlife;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DeerTest {
    @Test
    void shoot_when_still_living() {
        // given
        Deer livingDeer = new Deer();

        // when
        livingDeer.shoot();

        // then
        assertFalse(livingDeer.isAlive());
    }

    @Test
    void isDeerCollectible_when_still_living() {
        // given
        Deer livingDeer = new Deer();

        // when
        boolean isCollectible = livingDeer.isCollectible();

        // then
        assertFalse(isCollectible);
    }

    @Test
    void isDeerCollectible_when_carcass() {
        // given
        Deer carcassDeer = new Deer();
        carcassDeer.shoot();

        // when
        boolean isCollectible = carcassDeer.isCollectible();

        // then
        assertTrue(isCollectible);
    }

    @Test
    void isDeerCollectible_when_depleted() {
        // given
        Deer depletedDeer = new Deer();
        depletedDeer.shoot();
        depletedDeer.collectFood();
        depletedDeer.collectFood();
        depletedDeer.collectFood();
        depletedDeer.collectFood();

        // when
        boolean isCollectible = depletedDeer.isCollectible();

        // then
        assertFalse(isCollectible);
    }

    @Test
    void harvest_when_still_living() {
        // given
        Deer livingDeer = new Deer();

        // when
        int amountOfFoodCollected = livingDeer.collectFood();

        // then
        assertEquals(0, amountOfFoodCollected);
    }

    @Test
    void harvest_when_carcass() {
        // given
        Deer carcassDeer = new Deer();
        carcassDeer.shoot();

        // when
        int amountOfFoodCollected = carcassDeer.collectFood();
        int expectedAmountOfFoodCollected = carcassDeer.getState().getDeerSize() / 4;

        // then
        assertEquals(expectedAmountOfFoodCollected, amountOfFoodCollected);
    }

    @Test
    void harvest_when_depleted() {
        // given
        Deer depletedDeer = new Deer();
        depletedDeer.shoot();
        depletedDeer.collectFood();
        depletedDeer.collectFood();
        depletedDeer.collectFood();
        depletedDeer.collectFood();

        // when
        int amountOfFoodCollected = depletedDeer.collectFood();

        // then
        assertEquals(0, amountOfFoodCollected);
    }
}