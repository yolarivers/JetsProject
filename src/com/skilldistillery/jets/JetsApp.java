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
        boolean running = true;
        while (running) {
            displayMenu();
            int choice = keyboard.nextInt();
            keyboard.nextLine(); 

            switch (choice) {
                case 1:
                    airfield.listFleet();
                    break;
                case 2:
                    airfield.flyAllJets();
                    break;
                case 3:
                    airfield.viewFastestJet();
                    break;
                case 4:
                    airfield.viewJetWithLongestRange();
                    break;
                case 5:
                    airfield.loadAllCargoJets();
                    break;
                case 6:
                    airfield.dogfight();
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

    private void addJetToFleet() {
        System.out.println("\n--- Add a Jet to the Fleet ---");
        System.out.print("Enter jet type (Cargo, Fighter, Passenger): ");
        String type = keyboard.nextLine();
        System.out.print("Enter model: ");
        String model = keyboard.nextLine();
        System.out.print("Enter speed (in MPH): ");
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
        System.out.println("\n--- Remove a Jet from the Fleet ---");
        airfield.listFleet();
        System.out.print("Enter the number of the jet to remove: ");
        int index = keyboard.nextInt();
        keyboard.nextLine(); 

        if (index > 0 && index <= airfield.getJetsSize()) {
            airfield.removeJet(index - 1);
            System.out.println("Jet removed from fleet.");
        } else {
            System.out.println("Invalid jet number.");
        }
    }
}
