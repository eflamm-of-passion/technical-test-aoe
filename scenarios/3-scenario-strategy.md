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
   - The strategies should have a method to send a unit *as return*, for a given enemy unit *as parameter*

3. Implement a `Commander` class that:
   - Can deploy any unit strategy
   - Can switch strategies between waves

## Expected Outcome

- the commander should be able to send the counter unit of the arriving enemy unit
- the code of the commander, once written it should not be updated (Open/Closed Principle)

## Hints

<details>
<summary>Hint 1 - Combat Strategy Interface</summary>
<code>
interface CombatStrategy {
   public boolean isCounterOf(Unit enemyUnit);
   public Unit sendUnit();
   
}
</code>
</details>

<details>
<summary>Hint 2 - Unit Strategy Implementation</summary>
<code>
class ArcherStrategy implements CombatStrategy {
   @Override
   public boolean isCounterOf(Unit expectedEnemyUnit) {
      return expectedEnemyUnit.getClass() instanceof Pikeman.class;
   }

   @Override
   public Unit sendUnit() {
      return new Archer();
   }
}
</code>
</details>

May your tactical choices bring victory, noble ruler.

_TODO add the explanation about the Strategy Design Pattern_
