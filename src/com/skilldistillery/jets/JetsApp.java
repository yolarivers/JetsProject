package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {

	private AirField airfield = new AirField();
	@SuppressWarnings("unused")
	private Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		JetsApp app = new JetsApp();
		app.launch();
	}

	public void launch() {
		populateAirField(airfield);

		System.out.println("Buckle up and enjoy the flight!");
		for (Jet jet : airfield.getJets()) {
			System.out.println(jet);
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
