# Technical Test

Welcome, noble ruler!

This project is a series of exercises designed to teach and reinforce key software engineering principles such as the
Single Responsibility Principle, Dependency Injection, the Strategy Pattern, State Pattern and more. Each scenario
immerses you in a medieval roleplay setting, where your decisions as a ruler will shape the fate of your kingdom.

## Requirements

- Java 21 installed
- IDE for Java (preferably) 
- knowledge with Object Oriented Programming : polymorphism, composition, inheritance, abstraction
- knowledge with Java : abstract class, List, JUnit

## Purpose of These Tests

The goal of these tests is to:

- Help you understand and apply fundamental design principles and patterns.
- Encourage clean, maintainable, and extensible code.
- Provide a fun and engaging way to learn through roleplay scenarios.

## Scenarios

The scenarios are located in the `scenarios` directory. Each scenario presents a unique challenge for you to solve,
along with hints and examples to guide you. Here’s a brief overview:

1. [**The Specialization of Labor**](scenarios/1-scenario-srp.md)  
   Learn about the Single Responsibility Principle by organizing your villagers into specialized roles.

2. [**The Guard Tower Upgrade**](scenarios/2-scenario-di.md)  
   Learn about Dependency Injection by creating a modular guard tower system that allows weapons to be swapped without
   modifying the tower structure.

3. [**Strategic Unit Counters**](scenarios/3-scenario-strategy.md)  
   Master the Strategy Design Pattern by creating a flexible combat system to counter enemy attacks.

4. [**Prey States and Resource Collection**](scenarios/4-scenario-state.md)  
   Explore the State Design Pattern by managing the lifecycle of a deer and its resources.

## How to Navigate and Check Solutions

1. **Start with the scenarios**  
   Begin by reading the scenario files in the `scenarios` directory. Each file contains the context, tasks, and hints to
   help you implement the solution.

2. **Implement the solution**  
   Write your code in the same directory as the scenarios. Follow the instructions and ensure your implementation
   adheres to the principles and patterns described. You might have update the classes in the `main` and `test`
   repository.  
   In software engineering there is rarely only one solution to a given problem, so feel free to implement what you think is best. The hints are jsut suggestion. 

3. **Run the Tests**  
   Each scenario has corresponding tests to validate your solution. For example, you can run the test for the first
   scenario like this :
   ```bash
   ./gradlew test --tests "com.overlord.villagers.VillagerTest"
   ```

You can merge the solution branch into your current branch if needed.

## Notes

Keep your code simple and avoid over-engineering.
Focus on understanding the principles and patterns rather than rushing through the exercises.
If you have questions or need clarification, refer to the hints provided in each scenario file.
May your wisdom and code bring prosperity to your kingdom!