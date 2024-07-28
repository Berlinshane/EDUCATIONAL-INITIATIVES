# Java Design Patterns - Exercise 1

This repository contains various examples demonstrating the implementation of Java design patterns. The exercises are categorized into behavioral, creational, and structural design patterns, each showcasing practical use cases.

## Directory Structure

- **behavioral/**
  - Contains examples for behavioral design patterns.
  - **observer/**: Demonstrates the Observer pattern with a weather station and display systems.
  - **strategy/**: Demonstrates the Strategy pattern with different duck behaviors.

- **creational/**
  - Contains examples for creational design patterns.
  - **factory/**: Demonstrates the Factory Method pattern for creating different types of documents.
  - **singleton/**: Demonstrates the Singleton pattern for a database connection.

- **structural/**
  - Contains examples for structural design patterns.
  - **adapter/**: Demonstrates the Adapter pattern for media players.
  - **composite/**: Demonstrates the Composite pattern for managing employee hierarchies.

## Design Patterns Overview

- **Behavioral Patterns**: Focus on how objects interact and communicate. Examples include Observer and Strategy patterns.
- **Creational Patterns**: Deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. Examples include Factory Method and Singleton patterns.
- **Structural Patterns**: Concerned with how classes and objects are composed to form larger structures. Examples include Adapter and Composite patterns.

## Notes

- Ensure that you have Java Development Kit (JDK) installed.
- Follow the directory-specific instructions to compile and run the examples.
- For detailed explanations and implementation details, refer to individual `README.md` files in each subdirectory.

# Astronaut Daily Schedule Organizer

This console-based application helps astronauts organize their daily schedules by allowing users to add, remove, view, and manage tasks. Each task includes a description, start time, end time, and priority level. The application uses various design patterns to manage tasks and ensure proper functionality.

## Functional Requirements

### Mandatory Requirements

1. **Add a New Task**: Add a new task with a description, start time, end time, and priority level.
2. **Remove an Existing Task**: Remove a task from the schedule.
3. **View All Tasks**: View all tasks sorted by start time.
4. **Validate Task Overlaps**: Ensure that new tasks do not overlap with existing tasks.
5. **Error Handling**: Provide appropriate error messages for invalid operations.

### Optional Requirements

1. **Edit an Existing Task**: Modify details of an existing task.
2. **Mark Tasks as Completed**: Track task completion status.
3. **View Tasks by Priority Level**: Filter tasks based on their priority level.

## Design Patterns Used

1. **Singleton Pattern**: Ensures that only one instance of the `ScheduleManager` class exists, managing all tasks.
2. **Factory Pattern**: Uses a `TaskFactory` class to create `Task` objects, encapsulating task creation logic.
3. **Observer Pattern**: Notifies users if a new task conflicts with existing tasks.

## Key Components

1. **ScheduleManager**: 
   - Manages all tasks and ensures that only one instance exists (Singleton pattern).
   - Provides methods to add, remove, and view tasks.

2. **TaskFactory**:
   - Creates `Task` objects (Factory pattern).
   - Ensures that task creation is handled consistently and correctly.

3. **Task**:
   - Represents an individual task with attributes like description, start time, end time, and priority level.

4. **Observer**:
   - Monitors for task conflicts and alerts users if a new task overlaps with existing tasks.

5. **Main**:
   - Provides a user interface to interact with the application, handling user input and displaying task information.
