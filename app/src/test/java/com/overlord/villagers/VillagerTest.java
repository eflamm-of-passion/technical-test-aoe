package com.overlord.villagers;

import com.overlord.villagers.professions.Builder;
import com.overlord.villagers.professions.Hunter;
import com.overlord.villagers.professions.Lumberjack;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VillagerTest {
    // note : usually a unit test should test only one thing
    // but to keep the technical test short, we will be doing
    // everything in one

    @Test
     void time_to_build_your_economy() {
        // given
        List<Villager> settlement = new ArrayList<>();

        // when

        // create a hunter, a lumberjack and a builder
        Hunter hunter = new Hunter();
        Builder builder = new Builder();
        Lumberjack lumberJack = new Lumberjack();

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

        // check the job of each villager (use instanceof)
        assertEquals("Going there right now", moving);

        // I kept your testing logic despite pref
        // check the job of each villager (using their profession describe method)
        assertEquals("Going there right now", moving);
        assertEquals("Cutting some wood", cutting);
        assertEquals("Hunting some deers", hunting);
        assertEquals("Building a house", building);

        // check the type of each villager (using instanceof)
        assertInstanceOf(Hunter.class, hunter);
        assertInstanceOf(Builder.class, builder);
        assertInstanceOf(Lumberjack.class, lumberJack);
    }
}
