# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Calendar Versioning](https://calver.org/) of
the following form: YYYY.0M.0D.

## 2025.02.20

### Added
- Implemented **Minimalist To-Do List System** MVP component
  - **Core Methods**:
    - `addTask(String description)`: Adds a task to the list.
    - `removeTask(String description)`: Removes a task from the list.
    - `markTaskCompleted(String description)`: Marks a task as completed.
  - **Additional Features**:
    - `displayTasks()`: Displays all tasks in the list.
  - **Main Method**:
    - Demonstrates basic functionality of adding, removing, and completing tasks.

### Updated
- **Optimized `removeTask()` method**:
  - Replaced `for-each` loop with an indexed `for` loop to avoid `ConcurrentModificationException`.
- **Replaced ternary expression in `toString()`**:
  - Used explicit `if-else` instead of `? :` operator for better readability.


## 2025.02.04

### Added

- Designed a Simplified AI Social Simulation component
- Designed a Minimalist To-Do List Website component
- Designed a Tech Interview Preparation Platform component