package com.overlord.villagers;

/**
 * It's one of your subject, it is here to work for you my lady/lord
 */

/**
 * A Class should have a single, one and only, responsibility
 * "Do one thing and do it well"
 * This means the class should have only one reason to change,
 * ex : if the way of hunting changes, then only Hunter should change, not all the villagers.
 *
 * This separation improves maintability, readability, and testability
 */

public abstract class Villager {

    public Villager() {}

    /**
     * @return what it is doing
     */
    public String moveTo() {
        return "Going there right now";
    }
}
