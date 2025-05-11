package com.overlord.wildlife;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DeerTest {

    @Test
    public void harvest_when_still_living() {
        // given
        Deer livingDeer = new Deer();

        // when
        int amountOfFoodCollected = livingDeer.collectFood();

        // then
        assertEquals(0, amountOfFoodCollected);
    }

    @Test
    public void harvest_when_carcass() {
        // given
        Deer carcassDeer = new Deer();
        carcassDeer.shoot();

        // when
        int amountOfFoodCollected = carcassDeer.collectFood();

        // then
        assertEquals(25, amountOfFoodCollected);
    }

    @Test
    public void harvest_when_depleted() {
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