# Fourth Scenario - Prey States and Resource Collection

## Context

Wise Lord or Lady,

A hunter's success depends on understanding their prey. A deer passes through different states that determine how our villagers can interact with it:

- Living (must be hunted first)
- Harvested (ready for meat collection)
- Depleted (no resources remain)

May your hunters be patient and your harvests bountiful, noble ruler.

## Your Task

1. Create a prey state system where:

   - Each state determines how villagers can interact
   - States transition based on hunter actions
   - The prey's resources are only accessible in specific states

2. Implement these prey states:

   - `WildState` (deer is alive, can be hunted, no collection)
   - `CarcassState` (fresh kill, meat can be collected)
   - `DepletedState` (no resources remain, cannot interact)

3. Create a [Deer](../app/src/main/java/com/overlord/wildlife/Deer.java) class that:
   - Maintains its current state
   - Tracks remaining resources
   - Changes states based on hunter interactions
4. Verify the behavior in the [DeerTest](../app/src/test/java/com/overlord/wildlife/DeerTest.java) class

## Expected Outcome

Your solution should:

- Block resource collection from living prey
- Allow collection only from harvested carcasses
- Transition to depleted state when resources are exhausted
- Prevent invalid actions based on current state

## Hints

<details>
<summary>Hint 1 - State Interface</summary>
<code>
public interface DeerState {
    void hunt();
    int collect();
    boolean canCollect();
}
</code>
</details>

<details>
<summary>Hint 2 - Concrete State</summary>
<code>
public class CarcassState implements DeerState {
   private Deer deer; 
   private int remainingMeat = 100;

    @Override
    public int collect() {
        if (remainingMeat > 0) {
            remainingMeat -= 25;
            if (remainingMeat <= 0) {
                deer.setState(new DepletedState());
            }
            return 25;
        }
        return 0;
    }

}
</code>

</details>

<details>
<summary>Hint 3 - Deer Class</summary>
<code>
public class Deer {
    private DeerState state;

    protected void setState(DeerState state) {
        this.state = state;
    }

    public int collectFood() {
        return state.canCollect() ? state.collect() : 0;
    }

}
</code>

</details>

<details>
<summary>Hint 4 - Advanced implementation</summary>
In the previous examples we passed the Deer instance inside the state, for the state to be able to go to the next state after the action. But the fact that the child (DeerState) manipulates the parent (Deer) is not a good practice, but ok in this context. To fix this, the state could return a state at each action, so the Deer can update its state at every action, without knowing when the state chooses to go to the next state. 
</details>

## What you learned
In this scenario, you applied the State Design Pattern, which allows an object to alter its behavior when its internal state changes. By encapsulating the behavior of the Deer in distinct states (WildState, CarcassState, DepletedState), you ensured that each state handles specific actions and transitions. This approach promotes adherence to the Single Responsibility Principle, as each state class is responsible for its own behavior. It also enhances maintainability and scalability by isolating state-specific logic, making it easier to extend or modify the system.
