package com.overlord.villagers;

/**
 * It's one of your subject, it is here to work for you my lady/lord
 */
public abstract class Villager { // note : the villager could not be mandatory if there is a reason to exist without being a job right away

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

}
