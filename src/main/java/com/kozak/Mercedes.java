package com.kozak;

public class Mercedes implements Car {
	private int horsepower = 255;

	public Mercedes() {
	}

	public Mercedes(int housepower) {
		this.horsepower = housepower;
	}

	public void drive() {
		System.out.println("This mercedes have " + horsepower + " horsepowers!");
	}

}
