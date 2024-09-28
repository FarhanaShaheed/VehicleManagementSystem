# Homework 3:

## Name: Farhana Binta Shaheed
## Matriculation Number: 7216429

## 📄 Project Description
This project is a solution for Homework3, where we extend and modify the solution from Homework2 to create a more complex class hierarchy using inheritance and polymorphism in Java.

The main features of this project include:
- Creating a superclass `Engine` with subclasses `CombustionEngine`, `ElectricEngine`, and `HybridEngine`.
- Creating a `Manufacture` class with attributes for the name and country of the manufacturer.
- Creating an abstract superclass `Vehicle` with an abstract method `ShowCharacteristics()` and subclasses `ICEV` (Internal Combustion Engine Vehicle), `BEV` (Battery Electric Vehicle), and `HybridV`.
- Demonstrating the use of inheritance and polymorphism to display characteristics of different vehicle types.

## 📂 Project Structure
The project consists of the following Java files:
- `Engine.java`: Abstract class for engine types.
- `CombustionEngine.java`, `ElectricEngine.java`, `HybridEngine.java`: Subclasses of `Engine`.
- `Manufacture.java`: Class representing a vehicle's manufacturer.
- `Vehicle.java`: Abstract superclass representing vehicles.
- `ICEV.java`, `BEV.java`, `HybridV.java`: Subclasses of `Vehicle` representing different vehicle types.
- `VehicleManagement.java`: The main class to run the program and demonstrate the functionality.

## 📂 Run The Project
To run the Car Management System within Eclipse:
1. **Navigate to the `VehicleManagement.java` File**:
   - In Eclipse, expand the project tree in the `Project Explorer`.
   - Find `src` > `(default package)` > `VehicleManagement.java`.
2. **Run the Application**:
   - Right-click on `VehicleManagement.java`.
   - Select `Run As` > `Java Application`.
   - The application will execute and create output files in the project root directory, based on the predefined filters.

## 📂 Output Result
When you run the `VehicleManagement` class, the program will create instances of different vehicle types (ICEV, BEV, HybridV) and display their characteristics. The output will be printed to the console, showing the manufacture details and engine type for each vehicle.

