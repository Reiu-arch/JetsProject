package com.skilldistillery.jets.entities;

public abstract class Jet {
	private String model;
	private int speed;
	private int range;
	private double price;
	private String JetType;

	public Jet() {
	}

	public Jet(String model, int speed, int range, double price, String jetType) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
		this.JetType = jetType;
	}

	public double getSpeedInMach() {
		// TODO look up how to convert HPH into Mach
		// no need to override
		return 0.0;
	}

	public String getJetType() {
		return JetType;
	}

	public void setClass(String jetType) {
		JetType = jetType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return JetType + "  Model = " + model + ", Speed =" + speed + "MPH" + ", Range =" + range +"miles"+ ", Price = $"
				+ price;
	}

}
