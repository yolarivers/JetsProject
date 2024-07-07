package com.skilldistillery.jets;

public class PassengerJet extends Jet {
	public PassengerJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

	public void boardPassengers() {
		System.out.println(getModel() + " is boarding passengers.");
	}
}
