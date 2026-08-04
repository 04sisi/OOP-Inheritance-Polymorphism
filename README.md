# OOP-Inheritance-Polymorphism
Java OOP assignment demonstrating class design, inheritance, abstract classes, and polymorphism.

# OOP Inheritance and Polymorphism

## Overview

This project demonstrates the core principles of Object-Oriented Programming (OOP) in Java.

The program was developed as part of an academic programming activity to demonstrate:

- Class design
- Abstract classes
- Inheritance
- Polymorphism
- Method overriding
- Constructors
- Encapsulation using getters and setters
- Implicit and explicit use of the `toString()` method

## Project Structure

```
src/
│
├── Module.java
├── ProgrammingModule.java
├── NetworkingModule.java
└── ModuleTest.java
```

## Class Description

### Module

Abstract superclass representing a generic learning module.

Contains:

- Common attributes
- Constructors
- Getters and setters
- Abstract methods
- `toString()`

### ProgrammingModule

Subclass of `Module`.

Represents a programming-related module and provides its own implementation of the abstract methods.

### NetworkingModule

Subclass of `Module`.

Represents a networking-related module and overrides the abstract methods.

### ModuleTest

Contains the `main()` method.

Demonstrates:

- Creating superclass references to subclass objects
- Runtime polymorphism
- Calling overridden methods
- Implicit and explicit `toString()` calls

## Concepts Demonstrated

- Object-Oriented Programming
- Abstract Classes
- Inheritance
- Method Overriding
- Polymorphism
- Encapsulation

## How to Compile

Compile all Java files:

```bash
javac *.java
```

Run the program:

```bash
java ModuleTest
```

## Author

SISIPHO BATMANI
