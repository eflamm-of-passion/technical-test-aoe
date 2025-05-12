# Third Scenario - Strategic Unit Counters

## Context

Noble Lady or Lord,

Our scouts report incoming attacks from a rival kingdom! Each wave brings different units, and we must respond with the appropriate counter-units. As every commander knows:

- Archers defeat Pikemen
- Pikemen defeat Cavalry
- Cavalry defeat Archers

We need a flexible combat system that allows us to quickly adjust our defensive **strategy** based on the approaching threat.

May your tactical choices bring victory, noble ruler.

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

3. Implement a [Commander](../app/src/main/java/com/overlord/combat/Commander.java) class that:
   - Can deploy any unit strategy
   - Can switch strategies between waves
4. Verify the behavior in the [CommanderTest](../app/src/test/java/com/overlord/combat/CommanderTest.java) class

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

## What you learned

In this scenario, you applied the Strategy Design Pattern, which enables selecting an algorithm's behavior at runtime. By encapsulating unit counter logic into separate strategies (ArcherStrategy, PikemanStrategy, CavalryStrategy), you achieved flexibility and adherence to the Open/Closed Principle. This allows the Commander class to deploy counter-units dynamically without modifying its code when new strategies are introduced. This approach promotes maintainability and scalability in your combat system.

## Next scenario

[Fourth Scenario - Prey States and Resource Collection](./4-scenario-state.md)
