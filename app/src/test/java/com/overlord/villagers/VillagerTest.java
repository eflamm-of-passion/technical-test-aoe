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
        // TODO create a hunter, a lumberjack and a builder
        // TODO assign them to your settlement
        // TODO move one of them somewhere
        String moving = "";
        // TODO send them to gather food, cut wood, and build a house
        String cutting = "";
        String hunting = "";
        String building = "";

        // then
        assertEquals(3, settlement.size());

        // TODO check that the settlement has a villager at each job (use instanceof)

        assertEquals("Going there right now", moving);
        assertEquals("Cutting some wood", cutting);
        assertEquals("Hunting some deers", hunting);
        assertEquals("Building a house", building);
    }

}