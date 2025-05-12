# Second Scenario - The Guard Tower Upgrades

## Context

Esteemed Lady or Lord,

Your military engineers have designed a modular guard tower system. The initial towers are equipped with ballistas, but as your civilization advances, you'll want to upgrade them with more powerful weapons like cannons.

The current design requires rebuilding entire towers for upgrades. Your engineers suggest making the towers modular, allowing weapon systems to be swapped without reconstructing the entire structure.

May your defenses stand strong, noble ruler.

## Your Task

1. Create a modular guard tower system where:
   - The tower and its weapon system are separate components (would it be some kind of _composition_)
   - Weapons can be changed without modifying the tower structure
   - The tower delegates attack commands to its equipped weapon
2. Implement:
   - A [GuardTower](../app/src/main/java/com/overlord/defenses/GuardTower.java) class that can hold different weapons
   - A [Ballista](../app/src/main/java/com/overlord/defenses/Ballista.java) as the initial weapon
   - A Cannon as the upgrade option
3. Allow towers to be constructed with either weapon and support weapon replacement
4. Verify the behavior in the [GuardTowerTest](../app/src/test/java/com/overlord/defenses/GuardTowerTest.java) class

## Expected Outcome

- Guard towers should be able to fire with any compatible weapon
- Weapons should be easily swappable at runtime
- The tower code shouldn't need modification when adding new weapon types
- Each component should have a single responsibility

## Hints

<details>
<summary>Hint 1 - Weapon Interface</summary>
Consider creating a common interface for all weapons:
<code>
interface Weapon {
    void attack(String target);
}
</code>
</details>

<details>
<summary>Hint 2 - Tower Structure</summary>
The guard tower should accept a weapon in its constructor and provide a way to change it:
<code>
class GuardTower {
    private Weapon weapon;
    public GuardTower(Weapon weapon) {
        this.weapon = weapon;
    }
}
</code>
</details>

<details>
<summary>Hint 3 - Weapon Swap</summary>
Include a method to upgrade the weapon:
<code>
void upgradeWeapon(Weapon newWeapon) {
    this.weapon = newWeapon;
}
</code>
</details>

## What you learned
In this scenario, you applied the Dependency Injection (DI) principle, which promotes loose coupling between components. DI allows you to inject dependencies (like weapons) into a class (like GuardTower) rather than hardcoding them. This makes your code more flexible, testable, and easier to extend. By designing a modular guard tower system, you ensured that new weapons can be added or swapped without modifying the tower's code, adhering to the Open/Closed Principle.

## Next scenario

[Third Scenario - Strategic Unit Counters](./3-scenario-strategy.md)
