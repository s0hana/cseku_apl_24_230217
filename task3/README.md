# Refactoring Task 2: Implementation of MVC Architecture in the Hall Management System 

## Overview
This project is part of the Hall Management System development for our coursework. The goal of Task 3 was to refactor the previously implemented Task 2 codebase into the Model-View-Controller (MVC) architecture, ensuring clear separation of concerns and maintainability.

## Task Objective
The primary objective of this task was to:

1. Refactor the Task 2 code into an MVC architecture.
2. Place the Model in the **`model`** folder.
3. Place the View in the **`view`** folder, ensuring views only contain function
signatures with minimal functionality.
4. Place the Controller in the **`controller`** folder to act as the intermediary between the Model and the View.
5. Update the **`main`** class to utilize the MVC design.

## Folder Structure
The project follows the standard MVC architecture with the following structure:
```plaintext
src/
├── model/

│   ├── Address.java 
│   ├── ContactInfo.java
│   ├── Fee.java
│   ├── Student.java
│   ├── SpecialFee.java
│   ├── Room.java
│   ├── Bookable.java
│   ├── Payable.java
│   ├── RoomBooking.java
│   ├── RoomDetails.java
│   └── Hall.java
├── view/
│   ├── AddressView.java
│   ├── ContactInfoView.java
│   ├── FeeView.java
│   ├── StudentView.java
│   ├── RoomView.java
│   ├── RoomBookingView.java
│   └── HallView.java 
├── controller/
│   ├── AddressController.java
│   ├── ContactInfoController.java
│   ├── FeeController.java
│   ├── StudentController.java
│   ├── RoomController.java
│   ├── RoomBookingController.java
│   └── HallController.java
└── main/
    └── MVC_Main.java
```
## MVC Architecture Explanation

### 1. **Model**  
Contains the core logic and data representation for the system:
- **`Student`**: Represents the student entity with attributes like `name`, `student_id`, and academic information.
- **`Address`**: Stores the address details of entities (such as students and halls).
- **`ContactInfo`**: Manages contact details such as email and phone numbers.
- **`Fee` and `SpecialFee`**: Handle fee-related functionality, including regular fees and special fees with discounts.
- **`Room`**: Represents a room in the hall with details like room number and capacity.
- **`RoomBooking`**: Handles the booking of rooms by students, including start and end dates.
- **`RoomDetails`**: Interface for room-specific information (e.g., room number and capacity).
- **`Bookable`**: Interface for entities that can be booked, like rooms.
- **`Hall`**: Represents the hall, including the name, address, and contact info.
- **`Payable`**: Interface ensuring payment functionality for fee classes.

### 2. **View**  
Responsible for displaying information. For this task, views only contain **function signatures** with basic `System.out.println()` outputs (except **`StudentView`**, which contains the full code for checking whether the codes are correct or not) per the given instructions. Examples include:
- **`StudentView`**: Displays student details.
- **`AddressView`**: Displays address details.
- **`RoomView`**: Displays room-related details.
- **`ContactInfoView`**: Displays contact details.
- **`RoomBookingView`**: Displays room booking details.
- **`HallView`**: Displays hall-related information such as hall name, address, and contact details.

### 3. **Controller**  
Acts as an intermediary, managing interactions between the Model and View:
- **`AddressController`**: Manages address data and updates the view for display.
- **`FeeController`**: Handles fee-related operations, including displaying fee details and updating fee amounts.
- **`StudentController`**: Manages student-related data, ensuring the view is updated when details change.
- **`RoomController`**: Handles room data and ensures that room-related information is displayed.
- **`RoomBookingController`**: Manages room bookings, including creating, canceling, and updating bookings.
- **`HallController`**: Manages hall data, including the hall name, address, and contact info.
### 4. **Main Class**`(MVC_Main.java)`
The **`MVC_Main.java`** class is the entry point to the application and integrates the Model, View, and Controller.

## How It Works:
- **`Model`**: Represents the data and logic (e.g., **`Student`**, **`Fee`**).
- **`View`**: Displays the data with empty method signatures (as per instructions, except **`StudentView`**).
- **`Controller`** : Acts as a mediator between Model and View, updating the Model and reflecting changes in the View.
- **`Main`**: Ties the application together by creating instances of Model, View, and Controller, and manages the flow of data between them.

## Conclusion
In **`task3`**, the **`task2`** code was refactored into the **MVC architecture**, improving modularity and maintainability. The **`Model`** is used to handle data, the **`View`** is responsible for displaying it, and the **`Controller`** manages the interactions between them. By adopting **MVC**, the separation of concerns is enhanced, allowing for independent development and modification of the user interface and logic. This structure makes the system more flexible and easier to modify in the future, ensuring better maintainability and easier debugging.
