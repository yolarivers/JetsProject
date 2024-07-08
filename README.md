
# Jets Application

## Overview

The Jets Application is a Java-based console application that simulates a fleet of jets. The application allows users to view details about the fleet, fly the jets, add and remove jets from the fleet, and perform specific actions based on the type of jet (such as loading cargo or engaging in a dogfight).



## How to Use

1. **Start the Application**:
   - Run the `JetsApp` class to start the application.
   - The main menu will be displayed.

2. **Main Menu Options**:
   - **1. List fleet**: Displays all jets in the fleet with their details.
   - **2. Fly all jets**: Simulates flying all jets and shows their flight duration based on speed and range.
   - **3. View fastest jet**: Displays the fastest jet in the fleet.
   - **4. View jet with longest range**: Displays the jet with the longest range in the fleet.
   - **5. Load all Cargo Jets**: Calls the load cargo method on all cargo jets.
   - **6. Dogfight!**: Calls the dogfight method on all fighter jets.
   - **7. Add a jet to Fleet**: Prompts the user to enter details for a new jet and adds it to the fleet.
   - **8. Remove a jet from Fleet**: Lists all jets with their numbers and prompts the user to enter the number of the jet to remove.
   - **9. Quit**: Exits the application.

3. **Adding a Jet**:
   - Select option 7 from the main menu.
   - Enter the type of jet (Cargo, Fighter, Passenger).
   - Enter the model, speed, range, and price of the jet.
   - The new jet will be added to the fleet and displayed in the list.

4. **Removing a Jet**:
   - Select option 8 from the main menu.
   - The fleet will be displayed with numbered options.
   - Enter the number corresponding to the jet you want to remove.
   - The selected jet will be removed from the fleet.

5. **Exiting the Application**:
   - Select option 9 from the main menu to quit the application.



   ## Things Learned 



### Interface Implementation

- **CargoCarrier Interface**: Learned how to define and implement an interface, `CargoCarrier`, to provide specific functionality for cargo jets.
- **Polymorphism**: Applied polymorphism to allow different types of jets to be managed through a common interface.

### Object-Oriented Design

- **Inheritance**: Utilized inheritance to create specific types of jets (`CargoJet`, `FighterJet`, `PassengerJet`) that extend a base class (`Jet`).
- **Encapsulation**: Ensured proper encapsulation by making fields private and providing public methods for access and modification.

### Collections

- **ArrayList**: Used `ArrayList` to manage a dynamic collection of jets, providing flexibility in adding and removing jets from the fleet.

### Application Structure

- **Class Organization**: Organized the application into multiple classes, each with a clear responsibility, improving maintainability and readability.
- **Main Loop**: Designed a main loop in `JetsApp` to continuously prompt the user for actions until they choose to quit.

### Error Handling

- **Input Validation**: Implemented input validation to ensure the user provides correct and meaningful data for jet attributes.
- **Exception Handling**: Used try-catch blocks where appropriate to handle potential input errors gracefully.

### Code Refactoring
