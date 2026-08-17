# Experiment No. 2: Design Patterns Implementation

## Aim
To understand, implement, and compare different software design patterns by developing programs using Creational, Structural, and Behavioral patterns and analyzing their advantages, disadvantages, and applications.

## Objectives
- Understand the concept of software design patterns.
- Differentiate among Creational, Structural, and Behavioral design patterns.
- Implement commonly used design patterns in Java.
- Compare design patterns based on implementation and usage.
- Improve software reusability, maintainability, and flexibility.

## Implemented Patterns
This project contains Java implementations of the following patterns:
1. Singleton Pattern
2. Factory Pattern
3. Observer Pattern

## Files
- [src/designpatterns/Demo.java](src/designpatterns/Demo.java) - Main demo program
- [src/designpatterns/SingletonConfig.java](src/designpatterns/SingletonConfig.java) - Singleton implementation
- [src/designpatterns/ShapeFactory.java](src/designpatterns/ShapeFactory.java) - Factory implementation
- [src/designpatterns/WeatherStation.java](src/designpatterns/WeatherStation.java) - Observer implementation

## Code Overview

### 1. Singleton Pattern
The `SingletonConfig` class restricts object creation to a single instance. It uses a private constructor and a static synchronized method to ensure only one instance is created and reused.

Why it is useful:
- Centralized configuration management
- Shared resource handling
- Easy access to global state

### 2. Factory Pattern
The `ShapeFactory` class creates concrete objects based on the input type. This avoids direct object creation in the client code and makes the system easier to scale.

Why it is useful:
- Reduces tight coupling
- Simplifies object creation logic
- Easy to add new product types

### 3. Observer Pattern
The `WeatherStation` acts as the subject, while `TemperatureDisplay` objects act as observers. When the temperature changes, all observers are notified automatically.

Why it is useful:
- Event-driven systems
- Real-time updates
- Loose coupling between subject and observers

## Execution Result
The program was compiled and executed successfully using Java 17+.

Sample output:

```text
========================================
Design Patterns Demo - Singleton, Factory, Observer
========================================

1) Singleton Pattern
Same instance: true
Database URL: jdbc:postgresql://localhost:5432/appdb

2) Factory Pattern
Drawing a Circle
Drawing a Rectangle
Drawing a Triangle

3) Observer Pattern
Weather station updated temperature to: 25.5C
Phone received update: Temperature = 25.5C
Web Dashboard received update: Temperature = 25.5C
Weather station updated temperature to: 28.1C
Phone received update: Temperature = 28.1C
Web Dashboard received update: Temperature = 28.1C
```

## Comparison of Implemented Patterns

| Pattern | Category | Purpose | Complexity | Coupling | Flexibility | Real-world Applications |
|---|---|---|---|---|---|---|
| Singleton | Creational | Ensure only one instance of a class exists | Low | High if overused | Moderate | Config managers, logging, database connections |
| Factory | Creational | Create objects without exposing the creation logic | Medium | Low | High | UI controls, document factories, shape generation |
| Observer | Behavioral | Notify dependent objects when state changes | Medium | Low | High | Event systems, stock updates, weather apps |

## Advantages and Disadvantages

### Singleton
Advantages:
- Saves memory by reusing one object
- Easy access through a global point
- Useful for shared resources

Disadvantages:
- Can hide dependencies
- Harder to test in unit tests
- May introduce global state issues

### Factory
Advantages:
- Encapsulates object creation logic
- Supports adding new types with minimal code changes
- Reduces direct coupling

Disadvantages:
- Requires more classes for each product type
- Can become complex with many product variations

### Observer
Advantages:
- Promotes loose coupling between objects
- Supports dynamic subscriptions and notifications
- Ideal for event-driven systems

Disadvantages:
- Can create cascading notifications
- Observers may become difficult to manage when many are registered
- Debugging event flows can be harder

## Conclusion
The implemented patterns demonstrate how design patterns improve software maintainability, reusability, and flexibility. The Singleton pattern controls object creation, the Factory pattern centralizes object creation logic, and the Observer pattern supports reactive updates among objects. Together, these patterns help design systems that are easier to scale and maintain.

## How to Run
```bash
cd /workspaces/Software-Engineering
mkdir -p out
javac -d out $(find src -name "*.java")
java -cp out designpatterns.Demo
```

## Verification
The project was verified by compiling and executing the Java demo successfully in the workspace environment.
