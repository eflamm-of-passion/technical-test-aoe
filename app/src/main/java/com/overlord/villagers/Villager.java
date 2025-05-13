package com.overlord.villagers;

import com.overlord.villagers.capabilities.Movable;

/**
 * It's one of your subject, it is here to work for you my lady/lord
 */
public abstract class Villager implements Movable {
    protected Villager() {}

    public String moveTo() {
        return "Going there right now";
    }
}
