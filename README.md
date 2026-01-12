# Task Manager Application

This project is a personal task management application designed to efficiently manage day-to-day activities, allows you to create, edit, delete, and update the status of tasks. The main objective of the project is to demonstrate good practices in object-oriented programming and the correct use of design patterns, beyond simply fulfilling functionality.

## technologies

* Java JDK 17

## Main functionalities

* Create tasks
* Edit existing tasks
* Delete tasks
* Status management (pending, in progress, completed)
* Sort tasks by type or category
* Preparation for integration with external services

## Technical approach

This project was developed with an architectural approach, applying design patterns widely used in real backend applications

* **Singleton:** Used for task persistence in memory, ensuring a single instance of the repository during the application lifecycle.
* **Factory:** Implemented for the creation of different types of tasks.
* **Strategy:** Used to handle different behaviors depending on the type or status of the task, allowing the logic to be changed without modifying the main classes
* **Adapter:** Implemented to prepare for integration with external services, decoupling the internal logic of the system from external dependencies.
  






