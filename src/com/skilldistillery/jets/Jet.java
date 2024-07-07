package com.skilldistillery.jets;

public abstract class Jet {
	private String model;
	private double speed;
	private int range;
	private double price; 

	public Jet(String model, double speed, int range, double price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public double getSpeed() {
		return speed;
	}

	public int getRange() {
		return range;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Model: " + model + ", Speed: " + speed + " mph, Range: " + range + " miles, Price: $" + price;
	}
}
