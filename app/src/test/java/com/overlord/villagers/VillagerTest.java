package com.overlord.villagers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VillagerTest {

    // note : usually a unit test should test only one thing
    // but to keep the technical test short, we will be doing
    // everything in one

    @Test
    public void time_to_build_your_economy() {
        // given
        List<Villager> settlement = new ArrayList<>();

        // when

        // create a hunter, a lumberjack and a builder
        Hunter hunter = new Hunter();
        Builder builder = new Builder();
        LumberJack lumberJack = new LumberJack();

        // assign them to your settlement
        settlement.add(hunter);
        settlement.add(builder);
        settlement.add(lumberJack);

        // move one of them somewhere
        String moving = hunter.moveTo();

        // send them to gather food, cut wood, and build a house
        String cutting = lumberJack.cutWood();
        String hunting = hunter.gatherFood();
        String building = builder.buildSomething();

        // then
        assertEquals(3, settlement.size());

        // check that the settlement has a villager at each job (use instanceof)

        assertEquals("Going there right now", moving);
        assertEquals("Cutting some wood", cutting);
        assertEquals("Hunting some deers", hunting);
        assertEquals("Building a house", building);
    }

}