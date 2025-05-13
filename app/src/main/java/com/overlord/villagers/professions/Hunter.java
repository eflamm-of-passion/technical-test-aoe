package com.overlord.villagers.professions;

import com.overlord.villagers.Villager;

/**
 * To keep it simple, I'll keep separate methods for each villager,
 * but defining a common interface with a common method overloaded
 * per profession could be seen as an improvement
 */

public class Hunter extends Villager {
    public Hunter() {
        super();
    }

    public String gatherFood() {
        return "Hunting some deers";
    }
}
