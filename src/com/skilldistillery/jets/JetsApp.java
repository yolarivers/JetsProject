package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

    private AirField airfield = new AirField();
    private Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        JetsApp app = new JetsApp();
        app.launch();
    }

    public void launch() {
        populateAirField(airfield);

        boolean running = true;
        while (running) {
            displayMenu();
            int choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    listFleet();
                    break;
                case 2:
                    flyAllJets();
                    break;
                case 3:
                    viewFastestJet();
                    break;
                case 4:
                    viewJetWithLongestRange();
                    break;
                case 5:
                    loadAllCargoJets();
                    break;
                case 6:
                    dogfight();
                    break;
                case 7:
                    addJetToFleet();
                    break;
                case 8:
                    removeJetFromFleet();
                    break;
                case 9:
                    running = false;
                    System.out.println("Exiting... Thank you for using the Jets Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayMenu() {
        System.out.println("\n----- Jets Application Menu -----");
        System.out.println("1. List fleet");
        System.out.println("2. Fly all jets");
        System.out.println("3. View fastest jet");
        System.out.println("4. View jet with longest range");
        System.out.println("5. Load all Cargo Jets");
        System.out.println("6. Dogfight!");
        System.out.println("7. Add a jet to Fleet");
        System.out.println("8. Remove a jet from Fleet");
        System.out.println("9. Quit");
        System.out.print("Enter your choice: ");
    }

   
    private void listFleet() {
        for (Jet jet : airfield.getJets()) {
            System.out.println(jet);
        }
    }

  
    private void flyAllJets() {
        for (Jet jet : airfield.getJets()) {
            jet.fly();
        }
    }

    private void viewFastestJet() {
        Jet fastestJet = null;
        for (Jet jet : airfield.getJets()) {
            if (fastestJet == null || jet.getSpeed() > fastestJet.getSpeed()) {
                fastestJet = jet;
            }
        }
        if (fastestJet != null) {
            System.out.println("The fastest jet is: " + fastestJet);
        }
    }

    private void viewJetWithLongestRange() {
        Jet longestRangeJet = null;
        for (Jet jet : airfield.getJets()) {
            if (longestRangeJet == null || jet.getRange() > longestRangeJet.getRange()) {
                longestRangeJet = jet;
            }
        }
        if (longestRangeJet != null) {
            System.out.println("The jet with the longest range is: " + longestRangeJet);
        }
    }

    private void loadAllCargoJets() {
        for (Jet jet : airfield.getJets()) {
            if (jet instanceof CargoJet) {
                ((CargoJet) jet).loadCargo();
            }
        }
    }

    private void dogfight() {
        for (Jet jet : airfield.getJets()) {
            if (jet instanceof FighterJet) {
                ((FighterJet) jet).fight();
            }
        }
    }

    private void addJetToFleet() {
        System.out.print("Enter jet type (Cargo, Fighter, Passenger): ");
        String type = keyboard.nextLine();
        System.out.print("Enter model: ");
        String model = keyboard.nextLine();
        System.out.print("Enter speed: ");
        double speed = keyboard.nextDouble();
        System.out.print("Enter range: ");
        int range = keyboard.nextInt();
        System.out.print("Enter price: ");
        double price = keyboard.nextDouble();
        keyboard.nextLine(); 

        Jet newJet = null;
        switch (type.toLowerCase()) {
            case "cargo":
                newJet = new CargoJet(model, speed, range, price);
                break;
            case "fighter":
                newJet = new FighterJet(model, speed, range, price);
                break;
            case "passenger":
                newJet = new PassengerJet(model, speed, range, price);
                break;
            default:
                System.out.println("Invalid jet type.");
                return;
        }
        airfield.addJet(newJet);
        System.out.println("Jet added to fleet.");
    }

    private void removeJetFromFleet() {
        System.out.print("Enter the model of the jet to remove: ");
        String model = keyboard.nextLine();
        Jet jetToRemove = null;
        for (Jet jet : airfield.getJets()) {
            if (jet.getModel().equalsIgnoreCase(model)) {
                jetToRemove = jet;
                break;
            }
        }
        if (jetToRemove != null) {
            airfield.getJets().remove(jetToRemove);
            System.out.println("Jet removed from fleet.");
        } else {
            System.out.println("Jet not found.");
        }
    }

    private void populateAirField(AirField airField) {
        airField.addJet(new CargoJet("Lockheed C-130 Hercules", 541, 2360, 30000000.00));
        airField.addJet(new CargoJet("Boeing C-17 Globemaster III", 590, 2400, 218000000.00));
        airField.addJet(new FighterJet("F-22 Raptor", 1500, 1839, 150000000.00));
        airField.addJet(new FighterJet("F-35 Lightning II", 1200, 1379, 89500000.00));
        airField.addJet(new PassengerJet("Boeing 747", 570, 8300, 378500000.00));
    }
}
