package com.skilldistillery.jets;

import java.util.ArrayList;

public class AirField {
 
    private ArrayList<Jet> jets;

    public AirField() {
        jets = new ArrayList<>();
        
        jets.add(new CargoJet("Lockheed C-130 Hercules", 541, 2360, 30000000.00));
        jets.add(new CargoJet("Boeing C-17 Globemaster III", 590, 2400, 218000000.00));
        jets.add(new FighterJet("F-22 Raptor", 1500, 1839, 150000000.00));
        jets.add(new FighterJet("F-35 Lightning II", 1200, 1379, 89500000.00));
        jets.add(new PassengerJet("Boeing 747", 570, 8300, 378500000.00));
    }

    public void listFleet() {
        for (int i = 0; i < jets.size(); i++) {
            System.out.println((i + 1) + ". " + jets.get(i));
        }
    }

    public void flyAllJets() {
        for (Jet jet : jets) {
            jet.fly();
        }
    }

    public void viewFastestJet() {
        Jet fastestJet = null;
        for (Jet jet : jets) {
            if (fastestJet == null || jet.getSpeed() > fastestJet.getSpeed()) {
                fastestJet = jet;
            }
        }
        if (fastestJet != null) {
            System.out.println("The fastest jet is: " + fastestJet);
        }
    }

    public void viewJetWithLongestRange() {
        Jet longestRangeJet = null;
        for (Jet jet : jets) {
            if (longestRangeJet == null || jet.getRange() > longestRangeJet.getRange()) {
                longestRangeJet = jet;
            }
        }
        if (longestRangeJet != null) {
            System.out.println("The jet with the longest range is: " + longestRangeJet);
        }
    }

    public void loadAllCargoJets() {
        for (Jet jet : jets) {
            if (jet instanceof CargoCarrier) {
                ((CargoCarrier) jet).loadCargo();
            }
        }
    }

    public void dogfight() {
        for (Jet jet : jets) {
            if (jet instanceof FighterJet) {
                ((FighterJet) jet).fight();
            }
        }
    }

    public void addJet(Jet jet) {
        jets.add(jet);
    }

    public void removeJet(int index) {
        if (index >= 0 && index < jets.size()) {
            jets.remove(index);
        }
    }

    public int getJetsSize() {
        return jets.size();
    }
}
