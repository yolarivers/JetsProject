
# Jets Application

## Overview

The Jets Application is a Java-based console application that simulates a fleet of jets. The application allows users to view details about the fleet, fly the jets, add and remove jets from the fleet, and perform specific actions based on the type of jet (such as loading cargo or engaging in a dogfight).

## Features

- **List Fleet**: Displays all jets in the fleet with their details.
- **Fly All Jets**: Simulates flying each jet in the fleet and shows how long each jet can fly based on its speed and range.
- **View Fastest Jet**: Displays the jet with the highest speed in the fleet.
- **View Jet with Longest Range**: Displays the jet with the longest range in the fleet.
- **Load All Cargo Jets**: Calls the load cargo method for all cargo jets in the fleet.
- **Dogfight**: Calls the dogfight method for all fighter jets in the fleet.
- **Add a Jet to Fleet**: Allows the user to add a new jet to the fleet.
- **Remove a Jet from Fleet**: Allows the user to remove a jet from the fleet by its number.
- **Quit**: Exits the application.


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