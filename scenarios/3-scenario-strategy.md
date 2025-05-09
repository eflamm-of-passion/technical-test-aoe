# Third Scenario - Strategic Unit Counters

## Context

Noble Lady or Lord,

Our scouts report incoming attacks from a rival kingdom! Each wave brings different units, and we must respond with the appropriate counter-units. As every commander knows:

- Archers defeat Pikemen
- Pikemen defeat Cavalry
- Cavalry defeat Archers

We need a flexible combat system that allows us to quickly adjust our defensive **strategy** based on the approaching threat.

## Your Task

1. Create a combat strategy system where:

   - Each unit type has its own attack strategy
   - We can switch our defensive unit based on the enemy type
   - The system follows the rock-paper-scissors mechanics of unit counters

2. Implement these unit strategies:

   - `ArcherStrategy` (effective against Pikemen)
   - `PikemanStrategy` (effective against Cavalry)
   - `CavalryStrategy` (effective against Archers)

3. Implement a `Commander` class that:
   - Can deploy any unit strategy
   - Can switch strategies between waves

## Expected Outcome

TODO

## Hints

<details>
<summary>Hint 1 - Combat Strategy Interface</summary>
<code>
interface CombatStrategy {
    double attack(String enemyType);
}
</code>
</details>

<details>
<summary>Hint 2 - Unit Strategy Implementation</summary>
<code>
class ArcherStrategy implements CombatStrategy {
    @Override
    public double attack(String enemyType) {
        return enemyType.equals("Pikeman") ? 2.0 : 0.5;
    }
}
</code>
</details>

<details>
<summary>Hint 3 - Defense Commander</summary>
<code>
class DefenseCommander {
    private CombatStrategy strategy;

    public void setStrategy(CombatStrategy strategy) {
        this.strategy = strategy;
    }

    public double defendAgainst(String enemyType) {
        return strategy.attack(enemyType);
    }

}
</code>

</details>

May your tactical choices bring victory, noble ruler.

_TODO add the explanation about the Strategy Design Pattern_
