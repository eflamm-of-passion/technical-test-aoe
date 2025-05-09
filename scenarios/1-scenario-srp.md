# First scenario - The Specialization of Labor

## Context

Greetings, noble Lady or Lord,

You have just been appointed as the ruler of a small settlement. Your subjects are eager to serve, but there seems to be an issue with the current organization of labor. Each villager is attempting to perform all tasks - hunting, woodcutting, and construction - leading to inefficiency and confusion.

Your advisors suggest specializing your workforce to improve the productivity of your settlement. They believe that villagers should focus on specific trades rather than being jacks of all trades.

## Your Task

1. Examine the current `Villager` class in your domain
2. Reorganize your villagers into specialized roles:
   - Hunters who gather food
   - Lumberjacks who cut wood
   - Builders who construct buildings
3. Each specialist should only perform their dedicated task
4. Ensure that your new structure follows the Single Responsibility Principle

## Expected Outcome

- Each type of villager should have a single, clear purpose
- The code should be organized in a way that makes it easy to modify one aspect of a villager's behavior without affecting others
- Your settlement should have distinct classes for each specialist

## Hints

<details>
<summary>Hint 1 - Structure</summary>
Consider creating separate classes for each specialist type rather than having one class that does everything.
</details>

<details>
<summary>Hint 2 - Design</summary>
You might want to think about common behaviors all villagers share. Perhaps an interface or abstract class could be useful?
</details>

<details>
<summary>Hint 3 - Implementation</summary>
Each specialist class should only have methods related to their specific job. A Hunter shouldn't have methods for cutting wood or building.
</details>

May wisdom guide your decisions, noble ruler.

_TODO add the explanation about the Single Responsibility Principle_
