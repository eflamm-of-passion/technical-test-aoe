# Second Scenario - The Guard Tower Upgrades

## Context

Esteemed Lady or Lord,

Your military engineers have designed a modular guard tower system. The initial towers are equipped with ballistas, but as your civilization advances, you'll want to upgrade them with more powerful weapons like cannons.

The current design requires rebuilding entire towers for upgrades. Your engineers suggest making the towers modular, allowing weapon systems to be swapped without reconstructing the entire structure.

## Your Task

1. Create a modular guard tower system where:
   - The tower and its weapon system are separate components (would it be some kind of _composition_)
   - Weapons can be changed without modifying the tower structure
   - The tower delegates attack commands to its equipped weapon
2. Implement:
   - A `GuardTower` class that can hold different weapons
   - A `Ballista` as the initial weapon
   - A `Cannon` as the upgrade option
3. Allow towers to be constructed with either weapon and support weapon replacement

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

May your defenses stand strong, noble ruler.

_TODO add the explanation about the Dependency Injection_
