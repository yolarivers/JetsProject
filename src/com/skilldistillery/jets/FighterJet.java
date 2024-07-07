package com.skilldistillery.jets;

public class FighterJet extends Jet {
	public FighterJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println(getModel() + " is taking off for combat!");
	}
}
