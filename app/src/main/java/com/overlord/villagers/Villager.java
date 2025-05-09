package com.overlord.villagers;

/**
 * It's one of your subject, it is here to work for you my lady/lord
 */
public class Villager {

    public Villager() {}

    /*
      TODO
      That's great your villager is a jack of all trades, but maybe
      it should focus on one job at a time.
     */

    /**
     * @return what it is doing
     */
    public String moveTo() {
        return "Going there right now";
    }

    public String cutWood() {
        return "Cutting some wood";
    }

    public String gatherFood() {
        return "Hunting some deers";
    }

    public String buildSomething() {
        return "Building a house";
    }
}
