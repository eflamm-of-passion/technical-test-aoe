# Fourth Scenario - Prey States and Resource Collection

## Context

Wise Lord or Lady,

A hunter's success depends on understanding their prey. A deer passes through different states that determine how our villagers can interact with it:

- Living (must be hunted first)
- Harvested (ready for meat collection)
- Depleted (no resources remain)

## Your Task

1. Create a prey state system where:

   - Each state determines how villagers can interact
   - States transition based on hunter actions
   - The prey's resources are only accessible in specific states

2. Implement these prey states:

   - `WildState` (deer is alive, can be hunted, no collection)
   - `CarcassState` (fresh kill, meat can be collected)
   - `DepletedState` (no resources remain, cannot interact)

3. Create a `Deer` class that:
   - Maintains its current state
   - Tracks remaining resources
   - Changes states based on hunter interactions

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
    boolean hunt();
    int collect();
    boolean canCollect();
}
</code>
</details>

<details>
<summary>Hint 2 - Concrete State</summary>
<code>
public class CarcassState implements DeerState {
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

    public void setState(DeerState state) {
        this.state = state;
    }

    public int collectFood() {
        return state.canCollect() ? state.collect() : 0;
    }

}
</code>

</details>

May your hunters be patient and your harvests bountiful, noble ruler.

_TODO add the explanation about the State Design Pattern_
