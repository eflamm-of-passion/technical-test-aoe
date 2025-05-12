package com.overlord.villagers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
        Hunter hunter = new Hunter();
        Lumberjack lumberjack = new Lumberjack();
        Builder builder = new Builder();
        // TODO assign them to your settlement
        settlement.add(hunter);
        settlement.add(lumberjack);
        settlement.add(builder);
        // TODO move one of them somewhere
        String moving = hunter.moveTo();
        // TODO send them to gather food, cut wood, and build a house
        String cutting = lumberjack.cutWood();
        String hunting = hunter.gatherFood();
        String building = builder.buildSomething();

        // then
        assertEquals(3, settlement.size());
        // TODO check the job of each villager (use instanceof)
        boolean hasHunter = false;
        boolean hasLumberjack = false;
        boolean hasBuilder = false;

        for (Villager v : settlement) {
            if (v instanceof Hunter) {
                hasHunter = true;
            } else if (v instanceof Lumberjack) {
                hasLumberjack = true;
            } else if (v instanceof Builder) {
                hasBuilder = true;
            }
        }

        assertTrue(hasHunter, "Settlement should contain a Hunter");
        assertTrue(hasLumberjack, "Settlement should contain a Lumberjack");
        assertTrue(hasBuilder, "Settlement should contain a Builder");

        assertEquals("Going there right now", moving);
        assertEquals("Hunting some deers", hunting);
        assertEquals("Cutting some wood", cutting);
        assertEquals("Building a house", building);
    }

}